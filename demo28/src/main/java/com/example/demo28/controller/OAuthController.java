package com.example.demo28.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
public class OAuthController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return "👤Logged in as: " + principal.getAttribute("login");
    }
}
