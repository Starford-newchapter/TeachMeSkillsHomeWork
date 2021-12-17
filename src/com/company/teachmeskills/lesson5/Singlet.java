package com.company.teachmeskills.lesson5;

public class Singlet {
    private enumSize sizeSinglet;

    private String color;

    public enumSize getSizeSinglet() {
        return sizeSinglet;
    }

    public String getColor() {
        return color;
    }

    public void setSizeSinglet(enumSize sizeSinglet) {
        this.sizeSinglet = sizeSinglet;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Singlet(enumSize sizeSinglet, String color) {
        this.sizeSinglet = sizeSinglet;
        this.color = color;
    }
}