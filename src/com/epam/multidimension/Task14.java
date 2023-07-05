package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        int count;
        for (int i = 0; i < array.length; i++) {
            count = i + 1;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (--count) > 0 ? 0 : 1;
                System.out.printf("%7d ", array[i][j]);
            }
            System.out.println();
        }
    }
}