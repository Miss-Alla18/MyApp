package com.mirea.kornelyuk.galperina.myapp.dto;

public enum  Level {
    NOVICE("Новичок"),
    MIDDLE("Средний"),
    HARD("Тяжелый");

    public final String russianName;

    Level(String russianName) {
        this.russianName = russianName;
    }
}
