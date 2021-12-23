package com.company.teachmeskills.lesson7.AdditionalTask1;

public class Main {


    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(10, 20);
        Cylinder cylinder = new Cylinder(5, 10);
        SolidOfRevolution solidOfRevolution = new SolidOfRevolution(10, 4);
        Bail ball = new Bail(5);

        Box box = new Box(900);

        Shape[] shapes = {pyramid, cylinder, solidOfRevolution, ball};

        for (Shape shape : shapes) {
            System.out.println("Объем бокса " + box.getVolumeBox());
            System.out.println("Объём фигуры " + shape.getVolume());
            System.out.println(box.add(shape));

        }


    }

}
