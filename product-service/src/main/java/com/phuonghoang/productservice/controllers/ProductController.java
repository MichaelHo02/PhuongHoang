package com.phuonghoang.productservice.controllers;

import com.phuonghoang.productservice.domain.Product;
import com.phuonghoang.productservice.domain.dto.ProductDto;
import com.phuonghoang.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@Log4j2
@AllArgsConstructor
public class ProductController {
    private final ModelMapper modelMapper;
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto in) {
        log.info("@@ {}", in.toString());
        Product _product = modelMapper.map(in, Product.class);
        Product _out = productService.create(_product);
        ProductDto _outDto = modelMapper.map(_out, ProductDto.class);
        return new ResponseEntity<>(_outDto, HttpStatus.CREATED);
    }
}
