package com.company.teachmeskills.lesson5;

public class Singlet {
    private enumSize sizeSinglet;

    private String color;

    public Singlet(enumSize sizeSinglet, String color) {
        this.sizeSinglet = sizeSinglet;
        this.color = color;
    }

    public enumSize getSizeSinglet() {
        return sizeSinglet;
    }


    public String getColor() {
        return color;
    }
}



