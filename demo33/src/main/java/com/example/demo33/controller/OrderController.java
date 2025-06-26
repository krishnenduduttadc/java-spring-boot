package com.example.demo33.controller;

import com.example.demo33.service.OrderMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderMetricsService metricsService;

    private final Random random = new Random();

    @PostMapping("/place")
    public String placeOrder() {
        int value = random.nextInt(500) + 1; // simulate value
        metricsService.recordOrder(value);
        return "Order placed with value: " + value;
    }
}
