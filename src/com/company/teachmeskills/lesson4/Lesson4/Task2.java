package com.company.teachmeskills.lesson4.Lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2 {


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
        printOddElementsUnderMainDiagonal();
    }

    private static void printOddElementsUnderMainDiagonal() {
        int[][] array = generateArray();
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j <= i) {
                    if (array[i][j] % 2 != 0) {
                        System.out.println(array[i][j]);
                    }

                }
            }
        }
    }


}




