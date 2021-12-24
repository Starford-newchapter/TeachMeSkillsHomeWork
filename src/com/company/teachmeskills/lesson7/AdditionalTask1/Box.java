package com.company.teachmeskills.lesson7.AdditionalTask1;

import java.util.ArrayList;

public class Box extends Shape {
    private double availableVolumeBox;


    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double availableVolumeBox) {
        super(availableVolumeBox);
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

    public double getVolumeBox() {
        return availableVolumeBox;
    }


}








