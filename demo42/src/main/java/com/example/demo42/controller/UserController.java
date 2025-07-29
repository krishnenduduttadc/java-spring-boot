package com.example.demo42.controller;

import com.example.demo42.entity.User;
import com.example.demo42.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserCriteriaRepository userCriteriaRepo;

    @GetMapping("/native")
    public List<User> getUsersNative(@RequestParam int age) {
        return userRepo.findUsersWithAgeGreaterThan(age);
    }

    @GetMapping("/criteria")
    public List<User> getUsersCriteria(@RequestParam int minAge,
                                       @RequestParam String name) {
        return userCriteriaRepo.findUsersByAgeAndName(minAge, name);
    }
}
