package com.example.demo15.controller;

import com.example.demo15.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("✅ User created: " + userDTO.getName());
    }
}
