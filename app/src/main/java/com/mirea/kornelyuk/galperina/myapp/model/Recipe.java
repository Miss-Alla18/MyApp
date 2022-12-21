package com.mirea.kornelyuk.galperina.myapp.model;

public class Recipe {
    int id, category;
    String img, title, lvl, date, colour, text;

    public Recipe() {
    }

    public Recipe(int id, String img, String title, String lvl, String date, String colour, String text, int category) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.lvl = lvl;
        this.date = date;
        this.colour = colour;
        this.text = text;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
