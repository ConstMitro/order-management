package com.ordermanagementsystem.customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @PostMapping("/customer/create")
    public CustomerDto CreateCustomer(@RequestBody CustomerDto CustomerDto) {
        return CustomerDto;
    }
}
