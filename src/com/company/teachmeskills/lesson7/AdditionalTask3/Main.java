package com.company.teachmeskills.lesson7.AdditionalTask3;


public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(5, 7);
        Cylinder cylinder = new Cylinder(10, 3);
        Ball ball = new Ball(5);

        Box box = new Box(600);

        Shape[] shapes = {pyramid, cylinder, ball};

        for (Shape shape : shapes) {
            System.out.println("Объем бокса " + box.getVolume());
            System.out.println("Объём фигуры " + shape.getVolume());
            System.out.println(box.add(shape));
            System.out.println("Объем бокса " + box.getVolume());

        }

        System.out.println(box.getVolume());
    }
}
