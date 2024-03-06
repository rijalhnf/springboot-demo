package com.rjl.renderappdemo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/customers")

public class CustomerController {
    private static final List<Customer> CUSTOMERS = List.of(
      new Customer(1L, "john", "doe", "john@mail.com"),
      new Customer(2L, "mary", "public", "mary@mail.com"),
      new Customer(3L, "elon", "musk", "elon@mail.com"),
      new Customer(4L, "dunny", "duncan", "dunny@mail.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
}
