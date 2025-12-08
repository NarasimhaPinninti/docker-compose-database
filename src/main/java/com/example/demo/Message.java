package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    public Message() {}

    public Message(String message) {
        this.message = message;
    }

    public Long getId() { return id; }
    public String getMessage() { return message; }
}