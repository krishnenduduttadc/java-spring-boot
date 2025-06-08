package com.example.demo13.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTask {

    @Scheduled(fixedRate = 5000)
    public void printMessage() {
        System.out.println("🕒 Scheduled task running every 5 seconds - " + System.currentTimeMillis());
    }

    // Other options:
    // @Scheduled(fixedDelay = 10000) → wait 10s after task completes
    // @Scheduled(cron = "0 */1 * * * *") → every minute
}

