package com.company.teachmeskills.lesson7.AdditionalTask1;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super((4 / 3) * s * h);
        this.s = s;
        this.h = h;
    }


}
