package com.captials.app.repository;

import com.captials.app.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Long, Country> {
}
