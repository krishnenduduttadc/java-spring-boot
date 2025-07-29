package com.example.demo42.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Make sure your DB has a "users" table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // For auto-incremented IDs
    private Long id;

    @Column(nullable = false)
    private String name;

    private int age;

    // Constructors
    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
