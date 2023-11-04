package com.phuonghoang.orderservice.domain.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.phuonghoang.orderservice.domain.entity.ManufacturingOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link com.phuonghoang.orderservice.domain.entity.BuiltProduct}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BuiltProductDto implements Serializable {
    private Long id;
    private Long productCode;
    private Long qty;
}