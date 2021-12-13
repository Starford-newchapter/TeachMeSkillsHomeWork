package com.company.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task5 {

    private static int[][] generateArray() {
        System.out.println("Введите размерность массива ");
        int n = new Scanner(System.in).nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(50);

            }

        }
        return array;

    }

    private static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

    }


    public static void main(String[] args) {
        transportMatrix();


    }

    //Учтем заранее что матрица квадратная
    public static void transportMatrix() {
        int[][] array = generateArray();
        printArray(array);

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }

        }

        printArray(array);
    }
}
