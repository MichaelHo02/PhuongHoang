package com.phuonghoang.orderservice.controllers;

import com.phuonghoang.orderservice.domain.dto.ManufacturingOrderDto;
import com.phuonghoang.orderservice.domain.entity.ManufacturingOrder;
import com.phuonghoang.orderservice.services.ManufacturingOrderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
@AllArgsConstructor
@Log4j2
public class ManufacturingOrderController {
    private ModelMapper modelMapper;
    private ManufacturingOrderService moService;

    @PostMapping
    ResponseEntity<ManufacturingOrderDto> create(@RequestBody ManufacturingOrderDto moDto) {
        log.info("@@@ Create: {}", moDto.toString());
        ManufacturingOrder mo = modelMapper.map(moDto, ManufacturingOrder.class);
        ManufacturingOrder rMo = moService.create(mo);
        ManufacturingOrderDto rMoDto = modelMapper.map(rMo, ManufacturingOrderDto.class);
        return new ResponseEntity<>(rMoDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    ResponseEntity<ManufacturingOrderDto> get(@PathVariable("id") Long id) {
        log.info("@@@ Get: {}", id);
        ManufacturingOrder rMo = moService.get(id);
        ManufacturingOrderDto rMoDto = modelMapper.map(rMo, ManufacturingOrderDto.class);
        return new ResponseEntity<>(rMoDto, HttpStatus.OK);
    }

    @PutMapping("{id}")
    ResponseEntity<ManufacturingOrderDto> update(@PathVariable("id") Long id, @RequestBody ManufacturingOrderDto moDto) {
        log.info("@@@ Update: {} {}", id, moDto.toString());
        ManufacturingOrder mo = modelMapper.map(moDto, ManufacturingOrder.class);
        mo.setId(id);
        ManufacturingOrder rMo = moService.update(mo, id);
        ManufacturingOrderDto rMoDto = modelMapper.map(rMo, ManufacturingOrderDto.class);
        return new ResponseEntity<>(rMoDto, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    ResponseEntity<ManufacturingOrderDto> delete(@PathVariable("id") Long id) {
        log.info("@@@ Delete: {}", id);
        Boolean result = moService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
