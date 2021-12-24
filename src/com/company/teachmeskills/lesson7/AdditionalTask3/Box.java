package com.company.teachmeskills.lesson7.AdditionalTask3;

import java.util.ArrayList;

public class Box implements Shape {
    private double availableVolumeBox;

    ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double availableVolumeBox) {
        this.availableVolumeBox = availableVolumeBox;


    }

    public boolean add(Shape shape) {
        if (availableVolumeBox >= shape.getVolume()) {
            shapes.add(shape);
            availableVolumeBox -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return availableVolumeBox;
    }
}
