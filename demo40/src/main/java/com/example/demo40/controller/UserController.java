package com.example.demo40.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable int id) {
        if (id == 1) {
            return ResponseEntity.ok("User Found: ID 1"); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User not found"); // 404
        }
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody String userData) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("User created: " + userData); // 201
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    @GetMapping("/custom-header")
    public ResponseEntity<String> customHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-App-Version", "1.0.0");

        return ResponseEntity.ok()
                .headers(headers)
                .body("Header added!");
    }

}
