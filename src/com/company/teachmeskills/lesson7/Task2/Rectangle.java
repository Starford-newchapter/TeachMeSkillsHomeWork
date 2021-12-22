package com.company.teachmeskills.lesson7.Task2;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {

        System.out.println("Рисуем Треугольник с координатами: x=" + x + " y=" + y);

    }
}


