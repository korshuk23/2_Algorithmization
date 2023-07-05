package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 28. Дана матрица. Вывести на экран первую и последнюю строки
 */
public class Task28 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        printFirstAndLastRows(array);
    }

    private static void printFirstAndLastRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == array.length - 1) {
                    System.out.printf("%7d", array[i][j]);
                } else System.out.print("");
            }

        }
    }
}