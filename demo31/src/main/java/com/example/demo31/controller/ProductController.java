package com.example.demo31.controller;

import com.example.demo31.model.Product;
import com.example.demo31.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable String id) {
        return productRepository.findById(id);
    }

    @GetMapping("/all")
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
}
