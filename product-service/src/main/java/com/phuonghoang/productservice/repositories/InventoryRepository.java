package com.phuonghoang.productservice.repositories;

import com.phuonghoang.productservice.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
