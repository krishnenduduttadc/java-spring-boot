package com.example.demo26.listeners;

import com.example.demo26.events.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisteredListener {

    @EventListener
    public void handleUserRegistration(UserRegisteredEvent event) {
        System.out.println("📧 Admin notified: New user registered -> " + event.getUser().getName());
    }
}
