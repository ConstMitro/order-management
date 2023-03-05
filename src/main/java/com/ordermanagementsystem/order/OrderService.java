package com.ordermanagementsystem.order;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Optional<Order> getOrder(Integer id){

         return repository.findById(id);

    }

    public void createOrder(OrderDto orderDto){
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setValue(orderDto.getValue());
        order.setCurrency(orderDto.getCurrency());
        repository.save(order);

    }
}
