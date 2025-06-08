package com.example.demo28.controller;

import com.example.demo28.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jwt")
public class JwtController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username) {
        return jwtUtil.generateToken(username);
    }

    @GetMapping("/validate")
    public String validate(@RequestHeader("Authorization") String authHeader) {
        if (!authHeader.startsWith("Bearer ")) {
            return "Invalid token format";
        }
        String token = authHeader.substring(7);
        String username = jwtUtil.validateToken(token);
        return username != null ? "Valid JWT for user: " + username : "Invalid or expired token";
    }
}
