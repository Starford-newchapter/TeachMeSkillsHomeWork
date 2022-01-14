package com.company.teachmeskills.lesson9;

import java.util.*;

public class Store {
    List<Item> listOfItems = new ArrayList<>();


    public void addItems(Item item) {
        boolean isIdExist = false;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getId() == item.getId()) {
                isIdExist = true;

            }
        }
        if (isIdExist) {
            System.out.println("Товар c Id=" + item.getId() + " в списке уже есть");
        } else {
            listOfItems.add(item);
            System.out.println("Товар " + item.getName() + " добавлен в список");

        }


    }


    public List returnListOfItems() {
        return listOfItems;


    }

    public void removeItems(int id) {
        boolean isId = false;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getId() == id) {
                listOfItems.remove(i);
                isId = true;
            }
        }

        if (isId) {
            System.out.println("Товар с Id=" + id + " удален");

        } else {
            System.out.println("Товара с Id=" + id + " в списке нет");
        }

    }


    public void changelistOfItems(Item item) {
        boolean isReplace = false;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getId() == item.getId()) {
                listOfItems.set(i, item);
                isReplace = true;

            }

        }

        if (isReplace) {
            System.out.println("Товар с Id=" + item.getId() + " заменен");
        } else {
            System.out.println("Товара с Id=" + item.getId() + " в списке нет");
        }

    }

//
}
























