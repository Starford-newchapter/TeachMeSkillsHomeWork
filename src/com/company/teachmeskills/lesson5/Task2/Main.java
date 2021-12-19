package com.company.teachmeskills.lesson5.Task2;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(2.2, 110, "Дизель");
        Headlamp headLamp1 = new Headlamp(TypeHeadlamp.Xeon, "Включены");
        Transmission transmission1 = new Transmission(TransmissionMode.Drive);

        Car car1 = new Car(20, MachineDrive.Full, engine1, transmission1, headLamp1);

        car1.pressGasPedal();
        car1.pressBrakePedal();
        car1.turnSteeringWheel(31);

        headLamp1.turnOffHeadlight();
        car1.switchMod(TransmissionMode.Parking);


        System.out.println(car1.toString());


    }
}
