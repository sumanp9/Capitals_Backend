package com.captials.app.repository;

import com.captials.app.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
    @Query(value = "SELECT id, name,population, capital, region, continent from Country")
    List<String> findAllCountries();
}
