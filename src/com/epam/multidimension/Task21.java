package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 0 0 0 0 0 1
 * 0 0 0 0 2 0
 * 0 0 0 3 0 0
 * ...........
 */
public class Task21 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i == array.length - j - 1 ? i + 1 : 0;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}