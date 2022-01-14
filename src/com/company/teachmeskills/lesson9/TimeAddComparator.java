package com.company.teachmeskills.lesson9;

import java.util.Comparator;

public class TimeAddComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getTime().equals(o2.getTime())) {
            return 0;
        }
        if (o1.getTime().isBefore(o2.getTime())) {
            return 1;
        } else {
            return -1;
        }
    }
}

