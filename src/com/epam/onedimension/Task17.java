package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 17. Дан одномерный массив A[N]. Найти:
 * max(четных) + min(нечетных).
 */

public class Task17 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        int sum = sumOfMaxMin(array);
        System.out.println("Sum is equal: " + sum);
    }

    public static int sumOfMaxMin(int[] array) {
        int max = 0;
        int min = 0;
        for (int j : array) {
            max = j % 2 == 0 ? ArrayUtil.arrayMax(array) : max;
            min = j % 2 != 0 ? ArrayUtil.arrayMin(array) : min;
        }
        return max + min;
    }
}
