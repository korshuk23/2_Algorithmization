package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 11. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
 * встречается раньше - положительное или отрицательное.
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        System.out.println(positiveOrNegative(array));
    }

    public static String positiveOrNegative(int[] array) {
        String result = "";
        for (int j : array) {
            result = j > 0 ? "positive" : "negative";
        }
        return result;
    }
}
