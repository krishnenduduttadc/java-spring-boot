package com.example.demo18.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionedApiController {

    // URL Versioning
    @GetMapping("/api/v1/greet")
    public String greetV1() {
        return "👋 Hello from API v1";
    }

    @GetMapping("/api/v2/greet")
    public String greetV2() {
        return "🙌 Greetings from API v2";
    }

    // Header Versioning
    @GetMapping(value = "/api/greet", headers = "X-API-VERSION=1")
    public String greetHeaderV1() {
        return "Hello from Header API v1";
    }

    @GetMapping(value = "/api/greet", headers = "X-API-VERSION=2")
    public String greetHeaderV2() {
        return "Hello from Header API v2";
    }

    // Request Parameter Versioning
    @GetMapping(value = "/api/greet", params = "version=1")
    public String greetParamV1() {
        return "Hello from Param API v1";
    }

    @GetMapping(value = "/api/greet", params = "version=2")
    public String greetParamV2() {
        return "Hello from Param API v2";
    }
}
