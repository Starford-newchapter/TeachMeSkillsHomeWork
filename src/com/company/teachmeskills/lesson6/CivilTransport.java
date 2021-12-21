package com.company.teachmeskills.lesson6;
//Гражданский  воздушный транспорт

public class CivilTransport extends AirTransport {
    private int countPassengers;
    private boolean businessClass;

    public CivilTransport(double power, int maxSpeed, double weight, String model, int wingspan, int minAirstrip, int countPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minAirstrip);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void printDetails() {
        System.out.println("Характеристики Воздушного гражданского транспорта :");
        System.out.println("Мощность: " + power + " л.с." + "\n" + "Скорость: " + maxSpeed + " км/ч" + "\n" + "Вес машины: " + weight + " т\n" +
                "Модель транспорта: " + model + "\n" + "Размах крыльев: " + wingspan + " м" + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + minAirstrip + " м" + "\n" +
                "Количество пассажиров: " + countPassengers + "\n" + "Наличие бизнесс-класса: " + businessClass + "\n" +
                "Мощность в кВ: " + convertInPower() + " кВ");
        System.out.println();

    }




    public void liftPassengers(int passengers) {
        if (passengers <= countPassengers) {
            System.out.println("Гражданский самолет загружен");
        } else {
            System.out.println("Вам нужен гражданский самолет побольше");
        }

    }

}

