package com.company.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task3 {


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
        searchProductMainAndSideDiagonal();

    }

    private static void searchProductMainAndSideDiagonal() {
        int[][] array = generateArray();
        printArray(array);
        int productMain = 1;
        int productSide = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    productMain *= array[i][j];
                }
                if ((i + j) == array.length - 1) {
                    productSide *= array[i][j];
                }

            }

        }
        System.out.println("Произведение элементов  главной диагонали: " + productMain);
        System.out.println("Произведение элементов  побочной  диагонали: " + productSide);

        if (productMain > productSide) {
            System.out.println("Произведение элементов  главной диагонали больше");
        } else if (productMain < productSide) {
            System.out.println("Произведение элементов  побочной диагонали больше");
        } else {
            System.out.println("Произведение элементов  двух диагоналей равны ");

        }


    }
}
