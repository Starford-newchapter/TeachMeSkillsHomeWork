package com.company.teachmeskills.lesson9;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        PriceComparator priceComparator = new PriceComparator();


        Item car = new Item(2, "яашина", 43.30);
        Item laptop = new Item(1, "Ноутбук", 100);
        Item game = new Item(4, "Fifa 2020", 20.3);
        Item tShirt = new Item(5, "Майка", 50);
        Item car2 = new Item(2, "Машина Грузовая", 30);

        store.listOfItems.add(car);
        store.addItems(laptop);
        store.addItems(game);
        store.addItems(car2);
        store.addItems(tShirt);

        store.listOfItems.sort(priceComparator);
        System.out.println(store.returnListOfItems());


        store.removeItems(1);
        System.out.println(store.returnListOfItems());

        store.changelistOfItems(car2);
        System.out.println(store.returnListOfItems());




    }
}



































