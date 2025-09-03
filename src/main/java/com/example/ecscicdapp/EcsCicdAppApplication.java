package com.example.ecscicdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EcsCicdAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcsCicdAppApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Hello from Abdul Baaki N-Nyeyam Hudu! This is the ECS CI/CD Lab.";
    }

}
