package com.phuonghoang.orderservice.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MaterialPurchaseOrder {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "materialPurchaseOrder", cascade = CascadeType.ALL)
    private ManufacturingOrder manufacturingOrder;

    @OneToMany(mappedBy = "materialPurchaseOrder", cascade = CascadeType.ALL)
    private Set<MaterialPurchase> materialPurchases;
}
