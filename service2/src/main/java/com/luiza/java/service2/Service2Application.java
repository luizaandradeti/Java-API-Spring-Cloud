package com.luiza.java.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/page")
public class Service2Application {

    public static void main(String[] args) {

        SpringApplication.run(Service2Application.class, args);
    }

    @GetMapping("/welcome")
    public String home() {
        return " Welcome";
    }}
