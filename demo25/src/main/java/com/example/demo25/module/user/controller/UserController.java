package com.example.demo25.module.user.controller;

import com.example.demo25.module.user.model.User;
import com.example.demo25.module.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> list() {
        return userService.getAllUsers();
    }
}
