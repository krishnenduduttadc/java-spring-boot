package com.example.demo14;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class HttpService {

    private final WebClient webClient;

    public HttpService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> fetchFromHttpBin() {
        return webClient
                .get()
                .uri("https://httpbin.org/get")
                .retrieve()
                .bodyToMono(String.class);
    }
}

