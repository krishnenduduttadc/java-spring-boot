package com.example.demo22.controller;

import com.example.demo22.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestParam String username) {
        userService.registerUser(username);
        return "✅ User registered: " + username;
    }
}
