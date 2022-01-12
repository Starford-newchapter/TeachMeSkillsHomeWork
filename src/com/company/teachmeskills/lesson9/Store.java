package com.company.teachmeskills.lesson9;

import java.util.*;

public class Store {
    Map<Integer, Item> listOfItems = new HashMap<>();


    public void addItems(Item item) {
        if (listOfItems.containsKey(item.getId())) {
            System.out.println("Товар с данным Id уже существует");
        } else {
            listOfItems.put(item.getId(), item);
            System.out.println("Товар " + item.getName() + " добавлен в список");
        }


    }

    public Map<Integer, Item> returnListOfItems() {
        return listOfItems;


    }

    public void removeItems(int id) {
        if (listOfItems.containsKey(id)) {
            listOfItems.remove(id);
            System.out.println("Товар с Id= " + id + " удален");
        } else {
            System.out.println("Товара с Id=" + id + " в списке нет");
        }
    }


    public void changelistOfItems(Item item) {
        listOfItems.put(item.getId(), item);


    }

}







