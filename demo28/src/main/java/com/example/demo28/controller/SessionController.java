package com.example.demo28.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping("/set")
    public String setSession(HttpSession session) {
        session.setAttribute("username", "krishnendu");
        return "Session attribute set";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session) {
        String username = (String) session.getAttribute("username");
        return username != null ? "Session username: " + username : "No session data found";
    }

    @GetMapping("/invalidate")
    public String invalidate(HttpSession session) {
        session.invalidate();
        return "Session invalidated";
    }
}
