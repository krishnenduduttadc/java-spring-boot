package com.example.demo24.controller;

import com.example.demo24.service.UnreliableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/retry")
public class RetryController {

    @Autowired
    private UnreliableService unreliableService;

    @GetMapping
    public String callService() {
        return unreliableService.unreliableCall();
    }
}
