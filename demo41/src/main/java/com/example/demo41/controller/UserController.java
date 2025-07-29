package com.example.demo41.controller;

import com.example.demo41.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with ID " + id + " not found");
        }
        return "User found: ID 1";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFound(UserNotFoundException ex) {
        return "❌ Local Handler: " + ex.getMessage();
    }

}
