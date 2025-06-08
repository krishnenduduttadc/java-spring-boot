package com.example.demo11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello, World (Public)";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Hello, World (Secured)";
    }
}
