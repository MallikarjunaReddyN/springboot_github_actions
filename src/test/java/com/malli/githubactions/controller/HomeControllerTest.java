package com.malli.githubactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HomeControllerTest {

    @Autowired
    private HomeController controller;

    @Test
    void welcomeMsg() {
        assertEquals("Welcome to github actions with spring boot", controller.welcomeMsg());
    }
}