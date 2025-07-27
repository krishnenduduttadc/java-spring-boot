package com.example.demo37.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "app.service.env", havingValue = "dev", matchIfMissing = true)
public class DevService implements MyService {
    public String serve() {
        return "Serving from DEV";
    }
}
