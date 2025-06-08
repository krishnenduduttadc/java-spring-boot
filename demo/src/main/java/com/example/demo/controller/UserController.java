package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    // POST: Create a user
    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        return "User added: " + user.getName();
    }

    // GET: Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // PUT: Update user by index (for simplicity, using index in list)
    @PutMapping("/{index}")
    public String updateUser(@PathVariable int index, @RequestBody User updatedUser) {
        if (index >= 0 && index < users.size()) {
            users.set(index, updatedUser);
            return "User updated at index " + index;
        } else {
            return "User not found at index " + index;
        }
    }
}
