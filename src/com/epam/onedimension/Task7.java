package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 7. Даны действительные числа a1, a2, ... an.
 * Найти max(a1 + a2n, a2 + a2n−1, an + an+1).
 * .
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        int maxSum = maximumSum(array);
        System.out.println("MAX = " + maxSum);
    }

    public static int maximumSum(int[] array) {
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            maxSum = Math.max(array[i] + array[array.length - 1 - i], maxSum);
        }
        return maxSum;
    }
}