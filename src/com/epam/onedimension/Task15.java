package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 15. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она
 * возрастающей
 */
public class Task15 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        System.out.println(isIncreasing(array));
    }

    public static String isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return "non-increasing";
            }
        }
        return "increasing";
    }
}