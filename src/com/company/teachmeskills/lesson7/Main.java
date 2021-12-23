package com.company.teachmeskills.lesson7;

public class Main {


    public static void main(String[] args) {
        Shape pyramid = new Pyramid(10, 20);
        Shape cylinder = new Cylinder(5, 10);
        Shape solidOfRevolution = new SolidOfRevolution(10, 4);

        Box box = new Box(200);

        Shape[] shapes = {pyramid, cylinder, solidOfRevolution};

        for (Shape shape : shapes) {
            System.out.println(box.getVolumeBox());
            System.out.println(shape.getVolume());
            System.out.println(box.add(shape));

        }


    }

}
