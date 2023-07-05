package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        kRows(array);
        pColumns(array);
    }

    private static void kRows(int[][] array) {
        int k = ReaderUtil.readIntValue("Enter k");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == k - 1) {
                    System.out.printf("%7d", array[k][j]);
                }
            }
        }
    }

    private static void pColumns(int[][] array) {
        int p = ReaderUtil.readIntValue("Enter p");
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j == p - 1) {
                    System.out.printf("%7d", ints[p]);
                }
            }
        }
    }
}
