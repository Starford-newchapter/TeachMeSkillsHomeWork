package com.company.teachmeskills.lesson7.AdditionalTask1;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super(3.14 * radius * radius * height, radius);
        this.height = height;
    }
}
