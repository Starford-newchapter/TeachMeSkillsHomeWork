package com.company.teachmeskills.lesson7.Task2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }


}
