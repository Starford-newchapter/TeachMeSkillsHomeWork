package com.company.teachmeskills.lesson7.Task2;

public class Circle extends Shape {
    private int x;
    private int y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        System.out.println("Рисуем Окружность с координатами: x=" + x + " y=" + y);

    }


}
