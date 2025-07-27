package com.example.demo39.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
