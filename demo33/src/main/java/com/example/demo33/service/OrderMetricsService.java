package com.example.demo33.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class OrderMetricsService {

    private final Counter orderCounter;
    private final AtomicInteger lastOrderValue = new AtomicInteger();

    public OrderMetricsService(MeterRegistry registry) {
        orderCounter = Counter.builder("app_orders_total")
                .description("Total number of orders placed")
                .register(registry);

        Gauge.builder("app_last_order_value", lastOrderValue, AtomicInteger::get)
                .description("Value of the last order placed")
                .register(registry);
    }

    public void recordOrder(int amount) {
        orderCounter.increment();
        lastOrderValue.set(amount);
    }
}
