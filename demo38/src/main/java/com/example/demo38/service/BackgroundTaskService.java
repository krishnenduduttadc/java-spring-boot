package com.example.demo38.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BackgroundTaskService {

    @Async
    public void runAsyncTask() {
        System.out.println("🧵 Running async task on thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("✅ Async task finished.");
    }
}
