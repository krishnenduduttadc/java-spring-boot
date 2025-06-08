package com.example.demo27.controller;

import com.example.demo27.service.FlakyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletionStage;

@RestController
@RequestMapping("/api")
public class ResilienceController {

    private static final Logger logger = LoggerFactory.getLogger(ResilienceController.class);
    private final FlakyService flakyService;

    public ResilienceController(FlakyService flakyService) {
        this.flakyService = flakyService;
    }

    // Async endpoint with timeout + fallback support
    @GetMapping("/check-async")
    public CompletionStage<String> checkAsync() {
        logger.info("➡️  /api/check-async called");
        return flakyService.maybeFailAsync();
    }
}
