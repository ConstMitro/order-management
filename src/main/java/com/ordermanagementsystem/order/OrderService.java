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

    public String createOrUpdateOrder(OrderDto orderDto){
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setValue(orderDto.getValue());
        order.setCurrency(orderDto.getCurrency());
        order.setStatus(orderDto.getStatus());
        if (!doesOrderExist(orderDto.getId())&&orderDto.getStatus()==null) {
            order.setStatus("ONGOING");
            repository.save(order);
            return"created";
        }
        repository.save(order);
        return"updated";

    }
    private boolean doesOrderExist(Integer id){
       return getOrder(id).isPresent();

    }
}
