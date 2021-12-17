package com.company.teachmeskills.lesson5;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Locale;

class TShirt {
    private String color;
    private String print;
    private String size;

    public TShirt(String size, String color, String print) {
        this.size = size;
        this.color = color;
        this.print = print;
    }


    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getPrint() {
        return print;
    }


}


