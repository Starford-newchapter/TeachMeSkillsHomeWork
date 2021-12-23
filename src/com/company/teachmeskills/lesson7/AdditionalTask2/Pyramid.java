package com.company.teachmeskills.lesson7.AdditionalTask2;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    double getVolume() {
        return (4 / 3 * s * h);
    }
}
