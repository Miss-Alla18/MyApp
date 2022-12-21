package com.mirea.kornelyuk.galperina.myapp.dto;

public enum Category {
    SOUP("Супы"),
    DESSERT("Десерт"),
    DRINKS("Напитки"),
    MEAL("Мясо"),
    CHICKEN("Курица"),
    FISH("Рыба"),
    SALAD("Салат"),
    SNACKS("Закуски"),
    BAKERY("Выпечка");

    public final String russianCategory;

    Category(String russianCategory) {
        this.russianCategory = russianCategory;
    }
}
