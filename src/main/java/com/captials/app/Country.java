package com.captials.app;

import javax.persistence.*;

@Entity
@Table(name = "tbl_country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer population;

    private String capital;

    private String region;

    private String continent;

    public Country(Integer id, String name, Integer population, String capital, String region, String continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.region = region;
        this.continent = continent;
    }

    public Country() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
