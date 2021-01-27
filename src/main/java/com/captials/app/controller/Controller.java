package com.captials.app.controller;

import com.captials.app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    CountryService countryService;

    @GetMapping("/")
    public String home() {
        return "<h1>Hello and Welcome to the App</h1>";
    }

    @GetMapping("/getAllCountries")
    public List<String> getAllCountries() {
        return this.countryService.getAllCountries();
    }

}
