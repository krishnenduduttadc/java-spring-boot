package com.example.demo22.listener;

import com.example.demo22.event.UserCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener {

    @EventListener
    public void handleUserCreated(UserCreatedEvent event) {
        System.out.println("🎉 User created: " + event.getUsername());
    }
}
