package com.company.teachmeskills.lesson9;

import java.util.Comparator;

public class Item implements Comparable<Item> {
    private Integer id;
    private String name;
    private double price;

    public Item(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return id.compareTo(o.getId());
    }
}







