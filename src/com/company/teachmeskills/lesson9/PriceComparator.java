package com.company.teachmeskills.lesson9;

import java.util.Comparator;

public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}

