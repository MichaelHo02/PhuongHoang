package com.phuonghoang.orderservice.domain.dto;

import com.phuonghoang.orderservice.domain.entity.ManufacturingOrder;
import com.phuonghoang.orderservice.domain.entity.MaterialPurchase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.phuonghoang.orderservice.domain.entity.MaterialPurchaseOrder}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class MaterialPurchaseOrderDto implements Serializable {
    private Long id;
    private ManufacturingOrder manufacturingOrder;
    private Set<MaterialPurchase> materialPurchases;
}