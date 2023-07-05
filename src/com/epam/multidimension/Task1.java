package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
 * элемент больше последнего.
 */

public class Task1 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        printNotEvenColumns(array);
    }

    private static void printNotEvenColumns(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j % 2 == 0 && array[0][j] > array[array.length - 1][j]) System.out.printf("%7d", ints[j]);
            }
            System.out.println();
        }
    }
}