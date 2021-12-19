package com.company.teachmeskills.lesson5.Task1;

public class Singlet {
    private EnumSize sizeSinglet;

    private String color;

    public Singlet(EnumSize sizeSinglet, String color) {
        this.sizeSinglet = sizeSinglet;
        this.color = color;
    }

    public EnumSize getSizeSinglet() {
        return sizeSinglet;
    }


    public String getColor() {
        return color;
    }
}



