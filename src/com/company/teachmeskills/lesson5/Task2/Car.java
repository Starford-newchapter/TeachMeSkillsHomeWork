package com.company.teachmeskills.lesson5.Task2;

public class Car {
    private int rudderAngle; // угол наглона руля
    private MachineDrive machineDrive;
    private Engine engine;
    private Transmission transmission;
    Headlamp headlamp;


    public Car(int rudderAngle, MachineDrive machineDrive, Engine engine, Transmission transmission, Headlamp headlamp) {
        this.rudderAngle = rudderAngle;
        this.machineDrive = machineDrive;
        this.engine = engine;
        this.transmission = transmission;
        this.headlamp = headlamp;
    }

    void pressGasPedal() {
        engine.increaseEngineSpeed();
    }

    void pressBrakePedal() {
        engine.reduceEngineSpeed();
    }


    void turnSteeringWheel(int angle) {
        if (angle >= -30 && angle <= 30) {
            System.out.println("Вы повернули руль на угол: " + angle);
            rudderAngle += angle;
            System.out.println("Текущий угол руля:" + rudderAngle);
        } else {
            System.out.println("Нельзя повернуть руль на угол " + angle + ".Допустимое значение от -30 до 30 градусов");

        }
    }

    void switchMod(TransmissionMode transmissionMode) {
        transmission.changeTransmissionMode(transmissionMode);


    }

    @Override
    public String toString() {
        return "Car{" +
                "rudderAngle=" + rudderAngle +
                ", machineDrive=" + machineDrive +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", headlamp=" + headlamp +
                '}';
    }


}
