package com.example.demo25.module.user.service;

import com.example.demo25.module.user.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private final Map<Long, User> users = new HashMap<>();

    public User addUser(User user) {
        user.setId((long) (users.size() + 1));
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
}
