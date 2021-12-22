package com.company.teachmeskills.lesson7.Task1;

public class Cat extends Animal {
    private int age;

    public Cat(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");

    }

    @Override
    public void eat() {
        System.out.println("Кот ест");

    }


}

