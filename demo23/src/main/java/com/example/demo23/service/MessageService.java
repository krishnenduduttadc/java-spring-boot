package com.example.demo23.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("${app.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
