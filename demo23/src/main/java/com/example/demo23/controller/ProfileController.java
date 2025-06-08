package com.example.demo23.controller;

import com.example.demo23.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProfileController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/message")
    public String getProfileMessage() {
        return messageService.getMessage();
    }
}
