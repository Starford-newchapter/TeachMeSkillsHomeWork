package com.company.teachmeskills.lesson5.Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Human {
    private String firstName;
    private String lastLame;
    private LocalDate dateBirth;
    private double weight;
    private TShirt tshirt;
    private Singlet singlet;


    public Human(String firstName, String lastLame, LocalDate dateBirth, double weight, TShirt tshirt, Singlet singlet) {
        this.firstName = firstName;
        this.lastLame = lastLame;
        this.dateBirth = dateBirth;
        this.weight = weight;
        this.tshirt = tshirt;
        this.singlet = singlet;
    }


    public void printAge() {
        System.out.println("Мне " + Period.between(dateBirth, LocalDate.from(LocalDateTime.now())).getYears());
    }

    public void wentPrint() {
        System.out.println("Я иду");
    }

    public void printTShirtDetails() {
        System.out.println("Размер майки: " + tshirt.getSize());
        System.out.println("Цвет майки: " + tshirt.getColor());
        System.out.println("Надпись на майке: " + tshirt.getPrint());


    }

    public void printSingletDetails() {
        System.out.println("Размер штанов: " + singlet.getSizeSinglet());
        System.out.println("Цвет штанов: " + singlet.getColor());
    }

    public void changeTShirt(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    public void changeSinglet(Singlet singlet) {
        this.singlet = singlet;
    }


}



