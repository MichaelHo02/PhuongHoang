package com.phuonghoang.productservice.repositories;

import com.phuonghoang.productservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
