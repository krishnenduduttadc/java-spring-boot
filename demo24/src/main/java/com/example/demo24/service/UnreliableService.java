package com.example.demo24.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UnreliableService {

    private final Random random = new Random();

    @Retryable(
        value = {RuntimeException.class},
        maxAttempts = 4,
        backoff = @Backoff(delay = 1000)
    )
    public String unreliableCall() {
        System.out.println("🔁 Trying to call external system...");
        if (random.nextInt(5) < 4) { // 80% fail chance
            throw new RuntimeException("❌ Failed!");
        }
        return "✅ Success!";
    }
}
