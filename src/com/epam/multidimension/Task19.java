package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1*2 0 0 0 0
 * 0 2*3 0 0 0
 * 0 0 3*4 0 0
 * ...........
 */

public class Task19 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i == j ? (i + 1) * (i + 2) : 0;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}