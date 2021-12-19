package com.company.teachmeskills.lesson5.Task2;

//Коробка передач
public class Transmission {


    private TransmissionMode transmissionMode;

    public Transmission(TransmissionMode transmissionMode) {
        this.transmissionMode = transmissionMode;
    }


    void changeTransmissionMode(TransmissionMode transmissionMode) {
        if (this.transmissionMode == transmissionMode) {
            System.out.println("У вас уже стоит передача " + transmissionMode);
        } else {
            this.transmissionMode = transmissionMode;
            System.out.println("Передача переключена на " + transmissionMode);

        }
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transmissionMode=" + transmissionMode +
                '}';
    }
}
