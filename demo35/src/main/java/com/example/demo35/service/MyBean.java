package com.example.demo35.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("1️⃣ MyBean constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("2️⃣ @PostConstruct: Bean is initialized");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("3️⃣ @PreDestroy: Bean is about to be destroyed");
    }

    public void doWork() {
        System.out.println("✅ Doing some work in MyBean...");
    }
}
