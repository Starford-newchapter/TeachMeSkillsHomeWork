package com.company.teachmeskills.lesson7.AdditionalTask3;

public class Pyramid implements Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (4 / 3 * s * h);
    }
}
