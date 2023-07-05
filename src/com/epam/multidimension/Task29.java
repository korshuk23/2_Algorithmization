package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 29. Дана матрица. Вывести на экран первый и последний столбцы.
 */

public class Task29 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        printFirstAndLastColumns(array);
    }

    private static void printFirstAndLastColumns(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 0 || j == array.length - 1) {
                    System.out.printf("%7d", ints[j]);
                } else System.out.print("");
            }
            System.out.println();
        }
    }
}
