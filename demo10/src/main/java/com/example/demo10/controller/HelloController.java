package com.example.demo10.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello, Swagger!";
    }

    @PostMapping
    public String postHello(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
