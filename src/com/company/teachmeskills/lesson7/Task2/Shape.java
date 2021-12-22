package com.company.teachmeskills.lesson7.Task2;

import java.util.Objects;

abstract  public class Shape {
    protected String color;


    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }


}
