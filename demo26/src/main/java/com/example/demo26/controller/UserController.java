package com.example.demo26.controller;

import com.example.demo26.events.UserRegisteredEvent;
import com.example.demo26.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @PostMapping
    public String registerUser(@RequestBody User user) {
        // simulate saving user
        eventPublisher.publishEvent(new UserRegisteredEvent(user));
        return "✅ User registered!";
    }
}
