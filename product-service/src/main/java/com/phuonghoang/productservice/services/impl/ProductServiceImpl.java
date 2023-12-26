package com.phuonghoang.productservice.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phuonghoang.productservice.config.KafkaConfigProps;
import com.phuonghoang.productservice.domain.Product;
import com.phuonghoang.productservice.repositories.ProductRepository;
import com.phuonghoang.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import netscape.javascript.JSException;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ObjectMapper objectMapper;
    private KafkaTemplate<String, String> kafkaTemplate;
    private KafkaConfigProps kafkaConfigProps;

    private ProductRepository pRepo;

    @Override
    public Iterable<Product> createAll(Iterable<Product> ins) {
        return null;
    }

    @Override
    public Product create(Product in) {
        log.info("@@ {}", in.toString());
        if (in.getBillOfMaterials() == null || in.getBillOfMaterials().isEmpty()) {
            return pRepo.saveAndFlush(in);
        }
        in.getBillOfMaterials().forEach(billOfMaterial -> {
            billOfMaterial.getMaterials().forEach(material -> material.setBillOfMaterial(billOfMaterial));
            billOfMaterial.setProduct(in);
        });
        Product _product = pRepo.saveAndFlush(in);
        kafkaTemplate.send(kafkaConfigProps.getProductTopic(), "hello");

//        try {
//            final String payload = objectMapper.writeValueAsString(_product);
//        } catch (final JsonProcessingException exception) {
//            throw new JSException();
//        }

        return _product;
    }

    @Override
    public Product get(Long aLong) {
        return null;
    }

    @Override
    public Product update(Product in) {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) {
        return null;
    }
}
