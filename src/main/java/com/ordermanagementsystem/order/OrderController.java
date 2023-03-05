package com.ordermanagementsystem.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/order")
    public ResponseEntity<String> CreateOrder(@RequestBody OrderDto orderDto) {

        if (service.getOrder(orderDto.getId()).isPresent()){
            service.createOrder(orderDto);
            return ResponseEntity.ok(String.format("Your order %s was updated successfully",orderDto.getId()));
        }
        else {
            service.createOrder(orderDto);
            return ResponseEntity.ok(String.format("Your order %s was created successfully",orderDto.getId()));
        }

    }
}

