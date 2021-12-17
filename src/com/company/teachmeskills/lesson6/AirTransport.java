package com.company.teachmeskills.lesson6;

public abstract class AirTransport extends Vehicles {
    protected int wingspan;   //  Размах крыльев (м)
    protected int minAirstrip; // Минимальная длина взлётно-посадочной полосы для взлёта


    public AirTransport(double power, int maxSpeed, double weight, String model, int wingspan, int minAirstrip) {
        super(power, maxSpeed, weight, model);
        this.minAirstrip = minAirstrip;
        this.wingspan = wingspan;

    }


}
