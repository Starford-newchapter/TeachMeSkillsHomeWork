package com.company.teachmeskills.lesson9;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        PriceComparator priceComparator = new PriceComparator();
        TimeAddComparator timeAddComparator = new TimeAddComparator();


        Item car = new Item(2, "Машина", 43.30, LocalTime.now());
        sleepWait();
        Item laptop = new Item(1, "Ноутбук", 100, LocalTime.now());
        sleepWait();
        Item game = new Item(4, "Fifa 2020", 20.3, LocalTime.now());
        sleepWait();
        Item tShirt = new Item(5, "Майка", 50, LocalTime.now());
        sleepWait();
        Item car2 = new Item(2, "Машина Грузовая", 30, LocalTime.now());
        sleepWait();

        store.addItems(car);
        store.addItems(laptop);
        store.addItems(game);
        store.addItems(car2);
        store.addItems(tShirt);

        System.out.println();

        System.out.println(store.returnListOfItems());


        System.out.println("Сортируем по цене:");
        store.listOfItems.sort(priceComparator);
        System.out.println(store.returnListOfItems());
        System.out.println();


        store.removeItems(1);
        System.out.println();

        System.out.println("Сортируем по дате добавление по убыванию:");
        store.listOfItems.sort(timeAddComparator);
        System.out.println(store.returnListOfItems());
        System.out.println();

        store.changelistOfItems(car2);
        System.out.println(store.returnListOfItems());
    }

    public static void sleepWait() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}




































