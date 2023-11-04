package com.phuonghoang.productservice.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @Column(columnDefinition = "TIMESTAMP")
    @CreatedDate
    private Date currentTime;

    @ManyToOne
    @JoinColumn(name = "product_code")
    private Product product;

    private Long qty;
}
