package com.company.teachmeskills.lesson7.AdditionalTask1;

public class SolidOfRevolution extends Shape {
    private double radius;


    public SolidOfRevolution(double volume, double radius) {

        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
