package com.company.teachmeskills.lesson7.AdditionalTask3;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (3.14 * radius * radius * height);
    }
}
