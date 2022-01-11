package com.company.teachmeskills.lesson9;

import java.util.*;

public class Store {
    Map<Item, Integer> listOfItems = new HashMap<>();


    public void addItems(Item item) {
        if (listOfItems.containsValue(item.getId())) {
            System.out.println("Товар с данным Id уже существует");
        } else {
            listOfItems.put(item, item.getId());
            System.out.println("Товар " + item.getName() + " добавлен в список");
        }


    }

    public Set<Item> returnAllItems() {
        return listOfItems.keySet();
    }

    public void removeItems(int id) {
        Item key = null;

        for (Item k : listOfItems.keySet()) {
            if (listOfItems.get(k).equals(id)) {
                key = k;
                break;
            }
        }

        if (listOfItems.containsKey(key)) {
            listOfItems.remove(key);
            System.out.println("Товар с Id=" + id + " удален");
        } else {
            System.out.println("Товара с Id=" + id + " в списке нет");
        }


    }

    public void changelistOfItems(Item item) {
        listOfItems.put(item, item.getId());


        }

    }

