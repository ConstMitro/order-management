package com.ordermanagementsystem.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping("/order/create")
    public OrderDto CreateOrder(@RequestBody OrderDto orderDto) {
        return orderDto;
    }
}
