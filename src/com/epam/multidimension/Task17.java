package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1111111111
 * 1000000001
 * 1000000001
 * ..........
 * 1000000001
 * 1111111111
 */

public class Task17 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i == 0 || i == array.length - 1) ? 1 : (j == 0 || j == array.length - 1 ? 1 : 0);
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}
