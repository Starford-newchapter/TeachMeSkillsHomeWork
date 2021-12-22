package com.company.teachmeskills.lesson7.Task1;

public class Main {

    public static void main(String[] args) {
        Animal dog1 = new Dog("Мясо", "Минск", 100);
        Animal cat1 = new Cat("Молоко", "Брест", 5);
        Animal horse1 = new Horse("Трава", "Гомель", 12);
        Veterinarian veterinarian = new Veterinarian();


        Animal[] allAnimals = {dog1, cat1, horse1};


        for (int i = 0; i < allAnimals.length; i++) {
            veterinarian.treatAnimal(allAnimals[i]);

        }

    }
}
