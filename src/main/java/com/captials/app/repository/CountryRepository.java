package com.captials.app.repository;

import com.captials.app.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Long, Country> {
}
