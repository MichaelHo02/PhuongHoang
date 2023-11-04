package com.phuonghoang.orderservice.repositories;

import com.phuonghoang.orderservice.domain.entity.ManufacturingOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturingOrderRepository extends JpaRepository<ManufacturingOrder, Long> {
}
