package com.phuonghoang.productservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.phuonghoang.productservice.domain.Material}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class MaterialDto implements Serializable {
    private Long id;
    private Long productCode;
    private String productName;
    private String productDescription;
    private Set<String> productCategories;
    private Long qty;
    private Long cost;
}