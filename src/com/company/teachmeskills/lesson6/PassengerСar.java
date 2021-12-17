package com.company.teachmeskills.lesson6;

public class PassengerСar extends LandTransport {
    private String typeOfBody; // Тип кузова
    private int countPassengers; //Количество пассажиров

    public PassengerСar(double power, int maxSpeed, double weight, String model, int countWheels, double fuelFlow, String typeOfBody, int countPassengers) {
        super(power, maxSpeed, weight, model, countWheels, fuelFlow);
        this.typeOfBody = typeOfBody;
        this.countPassengers = countPassengers;
    }

    @Override
    public double convertInPower() {
        return power * 0.74;
    }

    @Override
    public void printDetails() {
        System.out.println("Характеристики Легкового автомобиля:");
        System.out.println("Мощность: " + power + " л.с." + "\n" + "Скорость: " + maxSpeed + " км/ч" + "\n" + "Вес машины: " + weight + " т\n" +
                "Модель транспорта: " + model + "\n" + "Количество колес: " + countWheels + "\n" + "Расход топлива: " + fuelFlow + " л/100 км\n" +
                "Тип кузова: " + typeOfBody + "\n" + "Количество пассажиров: " + countPassengers +
                "\n" + "Мощность в кВ: " + convertInPower() + " кВ");
        System.out.println();


    }

    private double countFuelFlow(double time) {
        double distance = maxSpeed * time;
        double newFuelFlow = fuelFlow / 100 * distance;
        return newFuelFlow;
    }


    public void printTripDistance(double time) {
        System.out.println("За время " + time + " ч" + " автомобиль " + model + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч " + " проедет " +
                (maxSpeed * time) + " км" + " и израсходует " + countFuelFlow(time) + " литров топлива");


    }


}


