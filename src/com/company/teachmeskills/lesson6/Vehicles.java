package com.company.teachmeskills.lesson6;

public abstract class Vehicles {
    protected double power;
    protected int maxSpeed;
    protected double weight;
    protected String model;


    public Vehicles(double power, int maxSpeed, double weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public abstract void printDetails();

    public  double convertInPower(){
        return power * 0.74;
    }


}
