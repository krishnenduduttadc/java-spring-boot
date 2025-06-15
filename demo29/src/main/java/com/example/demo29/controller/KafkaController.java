package com.example.demo29.controller;

import com.example.demo29.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    // Support GET and POST for testing
    @RequestMapping(value = "/send", method = {RequestMethod.GET, RequestMethod.POST})
    public String send(@RequestParam String message) {
        producerService.sendMessage(message);
        return "📤 Sent message: " + message;
    }
}
