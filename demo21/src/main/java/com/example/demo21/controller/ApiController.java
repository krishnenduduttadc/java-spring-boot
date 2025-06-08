package com.example.demo21.controller;

import com.example.demo21.service.ExternalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    @Autowired
    private ExternalApiService apiService;

    @GetMapping("/api/fetch")
    public Mono<String> fetchExternalData() {
        return apiService.fetchPost();
    }
}
