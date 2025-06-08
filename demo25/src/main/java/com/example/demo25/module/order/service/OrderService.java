package com.example.demo25.module.order.service;

import com.example.demo25.module.order.model.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {
    private final Map<Long, Order> orders = new HashMap<>();

    public Order addOrder(Order order) {
        order.setId((long) (orders.size() + 1));
        orders.put(order.getId(), order);
        return order;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}
