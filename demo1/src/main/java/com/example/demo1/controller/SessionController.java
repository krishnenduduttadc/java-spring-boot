package com.example.demo1.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/session")
public class SessionController {

    @PostMapping("/login")
    public String login(@RequestParam String username, HttpSession session) {
        session.setAttribute("username", username);
        return "User logged in: " + username;
    }

    @GetMapping("/current")
    public String getCurrentUser(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username != null) {
            return "Current user: " + username;
        } else {
            return "No user is logged in.";
        }
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "User logged out.";
    }
}
