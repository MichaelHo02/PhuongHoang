package com.phuonghoang.productservice.domain.entity;

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
public class BillOfMaterial {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_code")
    private Product product;

    @OneToMany(mappedBy = "billOfMaterial")
    private Set<Material> materials;
}
