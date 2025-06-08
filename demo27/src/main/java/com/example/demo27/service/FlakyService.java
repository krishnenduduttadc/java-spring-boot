package com.example.demo27.service;

import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Service
public class FlakyService {

    private final Random random = new Random();

    @TimeLimiter(name = "flakyService", fallbackMethod = "fallback")
    public CompletableFuture<String> maybeFail() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(random.nextInt(3000)); // may exceed TimeLimiter timeout
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (random.nextBoolean()) {
                throw new RuntimeException("Simulated Failure");
            }
            return "✅ Operation completed";
        });
    }

    public CompletableFuture<String> fallback(Throwable t) {
        return CompletableFuture.completedFuture("⚠️ Fallback response due to timeout or error");
    }
}
