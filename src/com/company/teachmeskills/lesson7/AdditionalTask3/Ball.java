package com.company.teachmeskills.lesson7.AdditionalTask3;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (3.14 * 3 / 4 * Math.pow(radius, 3));
    }
}
