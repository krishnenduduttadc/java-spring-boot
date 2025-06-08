package com.example.demo16.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isDatabaseUp = true; // simulate check
        if (isDatabaseUp) {
            return Health.up().withDetail("custom-db", "Available").build();
        } else {
            return Health.down().withDetail("custom-db", "Down").build();
        }
    }
}
