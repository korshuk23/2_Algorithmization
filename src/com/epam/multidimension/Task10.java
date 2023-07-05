package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

import java.util.Arrays;

/**
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        PrinterUtil.printOneDimArrayOfInt(arrayDiagonalPositiveNumbers(array));

    }

    private static int[] arrayDiagonalPositiveNumbers(int[][] array) {
        int count = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] >= 0) {
                    result[count++] = array[i][j];
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
