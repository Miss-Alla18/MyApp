package com.mirea.kornelyuk.galperina.myapp.dto;

public class Ingredient {

    private Integer id;

    private String name;

    public Ingredient() {
    }

    public Ingredient(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

