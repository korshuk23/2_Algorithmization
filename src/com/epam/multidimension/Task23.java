package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 23. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
 * первая строка справа налево, вторая строка слева направо, третья строка справа
 * налево и так далее.
 */

public class Task23 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        differentOrder(array);
    }

    public static void differentOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%7d", array[i][j]);
                } else {
                    System.out.printf("%7d", array[i][array.length - j - 1]);
                }
            }
            System.out.println();
        }
    }
}
