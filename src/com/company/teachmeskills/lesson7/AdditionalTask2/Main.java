package com.company.teachmeskills.lesson7.AdditionalTask2;


public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 4);
        Pyramid pyramid = new Pyramid(3, 4);
        Ball ball = new Ball(7);

        Box box = new Box(600);

        Shape[] shapes = {pyramid, cylinder, ball};

        for (Shape shape : shapes) {
            System.out.println("Объем бокса " + box.getVolumeBox());
            System.out.println("Объём фигуры " + shape.getVolume());
            System.out.println(box.add(shape));

        }


    }
}

