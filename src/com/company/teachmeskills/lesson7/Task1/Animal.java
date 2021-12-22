package com.company.teachmeskills.lesson7.Task1;

public abstract class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    abstract public void makeNoise();


    abstract public void eat();


    public void sleep() {
        System.out.println("Животное спит");
    }


}

