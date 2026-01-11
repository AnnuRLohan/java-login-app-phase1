package com.annu.loginapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/health")
    public String healthCheck() {
        return "Application is running";
    }
}