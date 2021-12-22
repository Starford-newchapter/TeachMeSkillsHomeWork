package com.company.teachmeskills.lesson7.Task1;

public class Dog extends Animal {
    private double weight;

    public Dog(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }


}
