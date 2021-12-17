package com.company.teachmeskills.lesson6;
// Грузовой транспорт

public class CargoTransport extends LandTransport {
    private double loadCapacity; // Грузоподъемность


    public CargoTransport(double power, int maxSpeed, double weight, String model, int countWheels, double fuelFlow, double loadCapacity) {
        super(power, maxSpeed, weight, model, countWheels, fuelFlow);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public double convertInPower() {
        return power * 0.74;
    }

    public void printDetails() {
        System.out.println("Характеристики Грузового автомобиля:");
        System.out.println("Мощность: " + power + " л.с." + "\n" + "Скорость: " + maxSpeed + " км/ч" + "\n" + "Вес машины: " + weight + " т\n" +
                "Модель транспорта: " + model + "\n" + "Количество колес: " + countWheels + "\n" + "Расход топлива: " + fuelFlow + " л/100 км\n" +
                "Грузоподъемность: " + loadCapacity + "\n" + "Мощность в кВ: " + convertInPower() + " кВ");
        System.out.println();

    }

    public void liftLoad(double weightLoad) {

        if (weightLoad <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("“Вам нужен грузовик побольше");
        }


    }


}
