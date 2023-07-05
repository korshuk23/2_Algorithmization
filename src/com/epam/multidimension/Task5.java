package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1...1 1 1
 * 2 2 2...2 2 0
 * 3 3 3...3 0 0
 * . . ..... . .
 * n-1 n-1 0...0 0 0
 * n 0 0...0 0 0
 */
public class Task5 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array.length - (i + j) <= 0 ? 0 : i + 1;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}