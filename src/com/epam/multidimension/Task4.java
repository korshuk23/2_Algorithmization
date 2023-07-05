package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 2 3 .... n
 * n n-1 n-2..1
 * 1 2 3 .... n
 * ............
 */
public class Task4 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i % 2 == 0 ? j + 1 : array.length - j;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}
