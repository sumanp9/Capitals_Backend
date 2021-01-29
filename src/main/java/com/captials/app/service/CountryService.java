package com.captials.app.service;

import com.captials.app.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository repository;

    public List<String> getAllCountries() {
        return repository.findAllCountries();
    }
}
