package com.phuonghoang.productservice.services.impl;

import com.phuonghoang.productservice.domain.Product;
import com.phuonghoang.productservice.repositories.ProductRepository;
import com.phuonghoang.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
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
        return pRepo.saveAndFlush(in);
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
