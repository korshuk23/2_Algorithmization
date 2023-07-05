package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
 * столбце. Определить, какой столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        int[] arrOfSums = arrayOfMaxSumsInColumns(array);
        maxSum(arrOfSums);
    }

    private static int[] arrayOfMaxSumsInColumns(int[][] array) {
        int sum;
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
                array2[i] = sum;
            }
        }
        return array2;
    }

    private static void maxSum(int[] array2) {
        int column = 0;
        int max = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
                column = i;
            }
        }
        System.out.println("Number of max sum in column[" + (column + 1) + "]. " + "Sum in the column is equal: " + max);
    }
}
