import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task1 {


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
        countSumEvenElementsMainDiagonal();

    }

    private static void countSumEvenElementsMainDiagonal() {
        int[][] array = generateArray();
        printArray(array);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] % 2 == 0) {
                        sum += array[i][j];
                    }
                }

            }

        }

        System.out.println(sum);


    }


}



