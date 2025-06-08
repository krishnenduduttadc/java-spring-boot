package com.example.demo25.module.order.model;

public class Order {
    private Long id;
    private String item;

    // Getters & Setters
    public Order() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}