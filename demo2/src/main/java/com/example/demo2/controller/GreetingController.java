package com.example.demo2.controller;

import com.example.demo2.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection (Best Practice)
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String greet(@RequestParam String name) {
        return greetingService.greet(name);
    }
}

