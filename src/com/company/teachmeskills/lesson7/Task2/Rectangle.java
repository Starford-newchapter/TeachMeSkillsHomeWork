package com.company.teachmeskills.lesson7.Task2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;

    }
}


