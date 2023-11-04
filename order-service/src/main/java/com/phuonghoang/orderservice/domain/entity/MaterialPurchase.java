package com.phuonghoang.orderservice.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MaterialPurchase {
    @Id
    @GeneratedValue
    private Long id;

    private Long productCode;

    private Long requiredQty;

    private Long fulfillQty;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private MaterialPurchaseOrder materialPurchaseOrder;
}
