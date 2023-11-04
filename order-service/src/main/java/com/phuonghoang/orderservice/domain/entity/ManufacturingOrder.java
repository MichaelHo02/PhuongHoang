package com.phuonghoang.orderservice.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturingOrder {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateOfOrder;

    private String clientName;

    @Temporal(TemporalType.DATE)
    private Date dateOfDelivery;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BuiltProduct> builtProducts = new ArrayList<>();

    @Temporal(TemporalType.DATE)
    private Date dateOfStart;

    @Temporal(TemporalType.DATE)
    private Date dateOfExpectedCompletion;

    @OneToOne
    @JoinColumn(name = "purchase_id")
    private MaterialPurchaseOrder materialPurchaseOrder;
}
