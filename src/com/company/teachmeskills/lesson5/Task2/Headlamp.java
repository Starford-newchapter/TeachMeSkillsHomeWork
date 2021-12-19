package com.company.teachmeskills.lesson5.Task2;

//Фары
public class Headlamp {
    private TypeHeadlamp typeHeadlamp;
    private String headlightsState;


    public Headlamp(TypeHeadlamp typeHeadlamp, String headlightsState) {
        this.typeHeadlamp = typeHeadlamp;
        this.headlightsState = headlightsState;
    }


    void turnOnHeadlight() {
        System.out.println("Фары включены");
        headlightsState = "Включены";

    }

    void turnOffHeadlight() {
        System.out.println("Фары выключены");
        headlightsState = "Выключены";
    }

    @Override
    public String toString() {
        return "Headlamp{" +
                "typeHeadlamp=" + typeHeadlamp +
                ", headlightsState='" + headlightsState + '\'' +
                '}';
    }
}
