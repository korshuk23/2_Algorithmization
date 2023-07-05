package com.epam.multidimension;

import com.epam.util.PrinterUtil;

import java.util.Random;

/**
 * 24. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
 * количество двузначных чисел в ней.
 */
public class Task24 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        PrinterUtil.printMultiDimArray(fillArray(array));
        countOfTwoDigitNumbers(array);
    }

    private static int[][] fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(999);
            }
        }
        return array;
    }

    public static void countOfTwoDigitNumbers(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > 10 && anInt < 99) {
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
    }
}
