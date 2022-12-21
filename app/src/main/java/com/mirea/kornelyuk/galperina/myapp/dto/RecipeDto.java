package com.mirea.kornelyuk.galperina.myapp.dto;


import java.util.Set;

public class RecipeDto {

    private Integer id;

    private String name;

    private String cooking_time;

    private String description;

    private Double protein;

    private Double fat;

    private String evaluation_of_dishes;

    private Double carbonydrates;

    private Double energy_values;

    private Double avg_rating;

    Set<Ingredient> nowsIngredient;

    private Level level;

    private Category category;

    public RecipeDto() {
    }

    public RecipeDto(String name, String cooking_time, Integer id_recipe, String description,
                     Double protein, Double fat, String evaluation_of_dishes, Double carbonydrates, Double energy_values, Double avg_rating) {
        this.setName(name);
        this.setCooking_time(cooking_time);
        this.setId(id_recipe);
        this.setDescription(description);
        this.setProtein(protein);
        this.setFat(fat);
        this.setEvaluation_of_dishes(evaluation_of_dishes);
        this.setCarbonydrates(carbonydrates);
        this.setEnergy_values(energy_values);
        this.setAvg_rating(avg_rating);
    }

    public String getEvaluation_of_dishes() {
        return evaluation_of_dishes;
    }

    public void setEvaluation_of_dishes(String evaluation_of_dishes) {
        this.evaluation_of_dishes = evaluation_of_dishes;
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

    public String getCooking_time() {
        return cooking_time;
    }

    public void setCooking_time(String cooking_time) {
        this.cooking_time = cooking_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getAvg_rating() {
        return avg_rating;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbonydrates() {
        return carbonydrates;
    }

    public void setCarbonydrates(Double carbonydrates) {
        this.carbonydrates = carbonydrates;
    }

    public Double getEnergy_values() {
        return energy_values;
    }

    public void setEnergy_values(Double energy_values) {
        this.energy_values = energy_values;
    }

    public Set<Ingredient> getNowsIngredient() {
        return nowsIngredient;
    }

    public void setNowsIngredient(Set<Ingredient> nowsIngredient) {
        this.nowsIngredient = nowsIngredient;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAvg_rating(Double avg_rating) {
        this.avg_rating = avg_rating;
    }
}