package com.phuonghoang.productservice.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long code;

    private String name;

    private String description;

    private Long unitCost;

    @ElementCollection(targetClass = String.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "categories", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "category", nullable = false)
    private Set<String> categories = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<BillOfMaterial> billOfMaterials;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Inventory> inventories;
}
