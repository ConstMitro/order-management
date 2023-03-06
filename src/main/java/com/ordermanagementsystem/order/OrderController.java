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
    public ResponseEntity<String> createOrUpdateOrder(@RequestBody OrderDto orderDto) {


            String operation = service.createOrUpdateOrder(orderDto);
            return ResponseEntity.ok(String.format("Your order %1$s was %2$s successfully",orderDto.getId(),operation));
        }



    }

