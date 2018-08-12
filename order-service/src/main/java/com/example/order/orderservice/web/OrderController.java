package com.example.order.orderservice.web;


import com.example.order.orderservice.dto.OrderDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class OrderController {

    public OrderDto saveOrder(){
        return new OrderDto();
    }
}
