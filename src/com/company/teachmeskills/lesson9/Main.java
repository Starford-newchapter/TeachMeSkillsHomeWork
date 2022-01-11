package com.company.teachmeskills.lesson9;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Item car = new Item(1, "Машина", 24.32);
        Item apple = new Item(3, "Яблоко", 12);
        Item gun = new Item(1, "Ружье", 2);
        Item laptop=new Item(4,"Ноутбук",54.32);
        Item car2=new Item(1, "Машина", 70);


        Store store = new Store();
        store.addItems(car);
        store.addItems(apple);
        store.addItems(gun);
        store.addItems(laptop);

        System.out.println();

        System.out.println(store.listOfItems);
        System.out.println();




        store.changelistOfItems(car2);
        System.out.println(store.listOfItems);



    }

}

