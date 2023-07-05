package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 1. В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        int sum = sumOfMultiples(array);
        System.out.println("Sum = " + sum);
    }

    private static int sumOfMultiples(int[] array) {
        int sum = 0;
        int k = ReaderUtil.readIntValue("Enter k value: ");
        for (int elem : array) {
            if (elem % k == 0) {
                sum += elem;
            }
        }
        return sum;
    }
}