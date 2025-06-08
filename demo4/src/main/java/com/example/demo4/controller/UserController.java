package com.example.demo4.controller;

import com.example.demo4.model.User;
import com.example.demo4.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        repo.save(user);
        return "User added.";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
