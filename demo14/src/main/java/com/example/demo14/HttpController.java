package com.example.demo14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webclient")
public class HttpController {

    private final HttpService httpService;

    public HttpController(HttpService httpService) {
        this.httpService = httpService;
    }

    @GetMapping("/call")
    public Mono<String> callHttpBin() {
        return httpService.fetchFromHttpBin();
    }
}
