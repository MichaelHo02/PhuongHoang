package com.phuonghoang.productservice.repositories;

import com.phuonghoang.productservice.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
