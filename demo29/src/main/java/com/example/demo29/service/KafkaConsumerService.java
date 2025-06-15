package com.example.demo29.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "demo-topic", groupId = "demo29-group")
    public void listen(String message) {
        System.out.println("✅ Received message: " + message);
    }
}
