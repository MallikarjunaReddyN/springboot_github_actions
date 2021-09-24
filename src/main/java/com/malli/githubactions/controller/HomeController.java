package com.malli.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String welcomeMsg() {
        return "Welcome to github actions with spring boot";
    }
}
