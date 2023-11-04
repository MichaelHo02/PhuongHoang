package com.phuonghoang.orderservice.services.impl;

import com.phuonghoang.orderservice.domain.entity.MaterialPurchaseOrder;
import com.phuonghoang.orderservice.repositories.MaterialPurchaseOrderRepository;
import com.phuonghoang.orderservice.services.MaterialPurchaseOrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MaterialPurchaseOrderServiceImpl implements MaterialPurchaseOrderService {
    private MaterialPurchaseOrderRepository mpoRepo;

    @Override
    public MaterialPurchaseOrder create(MaterialPurchaseOrder materialPurchaseOrder) {
        return mpoRepo.save(materialPurchaseOrder);
    }

    @Override
    public MaterialPurchaseOrder get(Long id) {
        return mpoRepo.findById(id).orElse(null);
    }

    @Override
    public MaterialPurchaseOrder update(MaterialPurchaseOrder materialPurchaseOrder, Long id) {
        return mpoRepo.save(materialPurchaseOrder);
    }

    @Override
    public Boolean delete(Long id) {
        mpoRepo.deleteById(id);
        return true;
    }
}
