package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    private final MessageRepository repo;

    public DemoApplication(MessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public List<Message> readAll() {
        return repo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}