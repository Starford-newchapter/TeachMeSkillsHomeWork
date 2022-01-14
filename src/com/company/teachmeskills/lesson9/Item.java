package com.company.teachmeskills.lesson9;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;

public class Item {
    private Integer id;
    private String name;
    private double price;
    private LocalTime time;

    public Item(Integer id, String name, double price, LocalTime time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = LocalTime.now();

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

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}









