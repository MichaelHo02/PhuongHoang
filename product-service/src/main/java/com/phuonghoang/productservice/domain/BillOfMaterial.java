package com.phuonghoang.productservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillOfMaterial {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_code")
    private Product product;

    @OneToMany(mappedBy = "billOfMaterial", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Material> materials;
}
