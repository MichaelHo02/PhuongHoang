package com.phuonghoang.orderservice.repositories;

import com.phuonghoang.orderservice.domain.entity.BuiltProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuiltProductRepository extends JpaRepository<BuiltProduct, Long> {
}
