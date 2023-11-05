package com.phuonghoang.productservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.phuonghoang.productservice.domain.BillOfMaterial}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BillOfMaterialDto implements Serializable {
    private Long id;
    private List<MaterialDto> materials;
}