package com.company.teachmeskills.lesson7.Task2;

public class Main {

    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", 3, 4);
        Shape rectangle1 = new Circle("Red", 5, 12);

        Shape[] shapes = {circle1, rectangle1};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();

        }

        System.out.println(circle1.equals(rectangle1));
    }
}
