package com.company.teachmeskills.lesson5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt("s", "black", "Life is good!");
        Singlet singlet1 = new Singlet(enumSize.m, "Red");

        TShirt tShirt2 = new TShirt("l", "White", "OFFWHITE");
        Singlet singlet2 = new Singlet(enumSize.s, "Pink");

        LocalDate dateBirth = LocalDate.of(2000, 6, 15);

        Human human1 = new Human("Vladislav", "Kornilchik", dateBirth, 500.34, tShirt1, singlet1);

        human1.wentPrint();
        human1.printAge();
        human1.printTShirtDetails();
        human1.printSingletDetails();

        human1.changeSinglet(singlet2);
        human1.changeTShirt(tShirt2);

        System.out.println();
        System.out.println("Поменяли майку и штаны. Результат:");


        human1.printTShirtDetails();
        human1.printSingletDetails();


    }


}
