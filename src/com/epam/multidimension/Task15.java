package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        PrinterUtil.printMultiDimArray(changeOddNumbersOnMax(array));
    }

    private static int[][] changeOddNumbersOnMax(int[][] array) {
        int max = ArrayUtil.findMultiDimArrayMax(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (array[i][j] % 2 != 0) ? max : array[i][j];
            }
        }
        return array;
    }
}
