package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 26. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
 * элементов.
 */

public class Task26 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        int sum = sumABSNegativeElements(array);
        System.out.println(sum);
    }

    private static int sumABSNegativeElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0 && array[i][j] <= 0) {
                    sum += Math.abs(array[i][j]);
                }
            }
        }
        return sum;
    }
}