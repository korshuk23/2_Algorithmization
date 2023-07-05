package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        PrinterUtil.printMultiDimArray(sortRows(array));
    }

    private static int[][] sortRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                ArrayUtil.bubbleSort(array[i]);
            } else {
                ArrayUtil.selectionSort(array[i]);
            }
        }
        return array;
    }
}