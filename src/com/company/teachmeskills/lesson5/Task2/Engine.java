package com.company.teachmeskills.lesson5.Task2;

public class Engine {
    private double engineCapacity; // Объём двигателя
    private int horsePower;// Лошадиные силы
    private String typeEngine; // Тип двигателя

    public Engine(double engineCapacity, int horsePower, String typeEngine) {
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.typeEngine = typeEngine;
    }

    void increaseEngineSpeed() {
        System.out.println("Обороты двигателя увеличены");
    }

    void reduceEngineSpeed() {
        System.out.println("обороты двигателя уменьшены");
    }


    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", typeEngine='" + typeEngine + '\'' +
                '}';
    }
}
