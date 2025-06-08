package com.example.demo22.service;

import com.example.demo22.event.UserCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void registerUser(String username) {
        System.out.println("👤 Registering user: " + username);
        publisher.publishEvent(new UserCreatedEvent(this, username));
    }
}
