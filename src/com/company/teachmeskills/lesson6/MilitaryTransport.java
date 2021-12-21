package com.company.teachmeskills.lesson6;
// Военный воздушный транспорт

public class MilitaryTransport extends AirTransport {
    private boolean ejectionSystem; // Система катапультирования
    private int countRockets; // Количество ракет на борту


    public MilitaryTransport(double power, int maxSpeed, double weight, String model, int wingspan, int minAirstrip, boolean ejectionSystem, int countRockets) {
        super(power, maxSpeed, weight, model, wingspan, minAirstrip);
        this.ejectionSystem = ejectionSystem;
        this.countRockets = countRockets;

    }

    @Override
    public void printDetails() {
        System.out.println("Характеристики Воздушного военного  транспорта :");
        System.out.println("Мощность: " + power + " л.с." + "\n" + "Скорость: " + maxSpeed + " км/ч" + "\n" + "Вес машины: " + weight + " т\n" +
                "Модель транспорта: " + model + "\n" + "Размах крыльев: " + wingspan + " м" + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + minAirstrip + " м" + "\n" +
                "Наличие системы катапультирования: " + ejectionSystem + "\n" + "Количество ракет на борту: " + countRockets + "\n"
                + "Мощность в кВ: " + convertInPower() + " кВ");
        System.out.println();

    }



    public void shoot() {
        if (countRockets > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }

    public void eject() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("“У вас нет такой системы");

        }
    }
}
