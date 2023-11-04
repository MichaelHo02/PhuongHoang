package com.phuonghoang.orderservice.domain.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO for {@link com.phuonghoang.orderservice.domain.entity.ManufacturingOrder}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ManufacturingOrderDto implements Serializable {
    private Long id;
    private Date dateOfOrder;
    private String clientName;
    private Date dateOfDelivery;
    private List<BuiltProductDto> builtProducts;
    private Date dateOfStart;
    private Date dateOfExpectedCompletion;
    private MaterialPurchaseOrderDto materialPurchaseOrder;
}