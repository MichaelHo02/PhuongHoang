package com.phuonghoang.productservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.phuonghoang.productservice.domain.Product}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductDto implements Serializable {
    private Long code;
    private String name;
    private String description;
    private Set<String> categories = new HashSet<>();
    private List<BillOfMaterialDto> billOfMaterials;
}