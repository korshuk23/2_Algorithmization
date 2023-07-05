package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 25. Дан двухмерный массив n×n элементов. Определить, сколько раз встречается
 * число 7 среди элементов массива.
 */
public class Task25 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        int count = howMuchTime(array);
        System.out.println("Number 7 occurs " + count + " times.");
    }

    private static int howMuchTime(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}