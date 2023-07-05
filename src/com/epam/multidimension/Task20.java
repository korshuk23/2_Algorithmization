package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * n 0 0 0 0 0
 * 0 n-1 0 0 0 0
 * 0  0  n-2 0 0
 * .............
 */
public class Task20 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i == j ? array.length - i : 0;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}