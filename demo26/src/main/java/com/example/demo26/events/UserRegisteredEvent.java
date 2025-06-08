package com.example.demo26.events;

import com.example.demo26.model.User;

public class UserRegisteredEvent {
    private final User user;

    public UserRegisteredEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
