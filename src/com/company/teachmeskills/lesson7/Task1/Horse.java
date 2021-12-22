package com.company.teachmeskills.lesson7.Task1;

public class Horse extends Animal {
    private double height;

    public Horse(String food, String location, double height) {
        super(food, location);
        this.height = height;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }


    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }


}

