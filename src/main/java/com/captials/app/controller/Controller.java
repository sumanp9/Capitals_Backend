package com.captials.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "<h1>Hello and Welcome to the App</h1>";
    }

}
