package com.example.demo25.module.order.controller;

import com.example.demo25.module.order.model.Order;
import com.example.demo25.module.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping
    public List<Order> list() {
        return orderService.getAllOrders();
    }
}
