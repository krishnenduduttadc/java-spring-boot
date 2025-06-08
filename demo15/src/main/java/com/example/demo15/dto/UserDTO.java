package com.example.demo15.dto;

import jakarta.validation.constraints.*;

public class UserDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email is not valid")
    private String email;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 99, message = "Age must be less than 100")
    private int age;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
