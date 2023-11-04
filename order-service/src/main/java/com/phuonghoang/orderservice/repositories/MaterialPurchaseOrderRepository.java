package com.phuonghoang.orderservice.repositories;

import com.phuonghoang.orderservice.domain.entity.MaterialPurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialPurchaseOrderRepository extends JpaRepository<MaterialPurchaseOrder, Long> {
}
