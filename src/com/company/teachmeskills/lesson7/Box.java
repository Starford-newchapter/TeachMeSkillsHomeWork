package com.company.teachmeskills.lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class Box extends Shape {
    private double volumeBox;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volumeBox) {

        super(volumeBox);
        this.volumeBox = volumeBox;
    }

    public double getVolumeBox() {
        return volumeBox;
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
}







