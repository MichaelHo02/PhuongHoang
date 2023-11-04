package com.phuonghoang.orderservice.services.impl;

import com.phuonghoang.orderservice.domain.entity.BuiltProduct;
import com.phuonghoang.orderservice.domain.entity.ManufacturingOrder;
import com.phuonghoang.orderservice.repositories.BuiltProductRepository;
import com.phuonghoang.orderservice.repositories.ManufacturingOrderRepository;
import com.phuonghoang.orderservice.services.ManufacturingOrderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class ManufacturingOrderServiceImpl implements ManufacturingOrderService {
    private ManufacturingOrderRepository moRepo;
    private BuiltProductRepository bpRepo;

    @Override
    public ManufacturingOrder create(ManufacturingOrder manufacturingOrder) {
        manufacturingOrder.getBuiltProducts().forEach(builtProduct -> builtProduct.setOrder(manufacturingOrder));
        ManufacturingOrder _manufacturingOrder = moRepo.save(manufacturingOrder);
        return _manufacturingOrder;
    }

    @Override
    public ManufacturingOrder get(Long id) {
        return moRepo.findById(id).orElse(null);
    }

    @Override
    public ManufacturingOrder update(ManufacturingOrder manufacturingOrder, Long id) {
        return moRepo.save(manufacturingOrder);
    }

    @Override
    public Boolean delete(Long id) {
        moRepo.deleteById(id);
        return true;
    }
}
