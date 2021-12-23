package com.company.teachmeskills.lesson7.AdditionalTask2;

import java.util.ArrayList;

public class Box extends Shape {
    private double volumeBox;
    ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volumeBox) {
        this.volumeBox = volumeBox;

    }

    public boolean add(Shape shape) {
        if (volumeBox >= shape.getVolume()) {
            shapes.add(shape);
            volumeBox -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    public double getVolumeBox() {
        return volumeBox;
    }

    @Override
    double getVolume() {
        return volumeBox;
    }
}
