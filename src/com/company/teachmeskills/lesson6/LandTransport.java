package com.company.teachmeskills.lesson6;

public abstract class LandTransport extends Vehicles {
    protected int countWheels; //Количество колёс
    protected double fuelFlow;  // Расход топлива(л/100км)


    public LandTransport(double power, int maxSpeed, double weight, String model, int countWheels, double fuelFlow) {
        super(power, maxSpeed, weight, model);
        this.countWheels = countWheels;
        this.fuelFlow = fuelFlow;

    }


}


