package com.example.demo36.service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@Scope("singleton") // Change to "prototype", "request", or "session" as needed
public class ScopedBean {

    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialized bean with ID: " + id);
    }
}
