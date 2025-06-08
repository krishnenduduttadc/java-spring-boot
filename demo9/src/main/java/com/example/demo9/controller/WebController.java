package com.example.demo9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Spring Boot + Thymeleaf");
        return "hello";
    }
}
