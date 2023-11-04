package com.phuonghoang.productservice.domain.entity;

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
public class Material {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private BillOfMaterial billOfMaterial;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Long qty;

    private Long cost;
}
