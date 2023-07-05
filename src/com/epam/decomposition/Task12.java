package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

import java.util.Arrays;

/**
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
 * которого являются числа, сумма цифр которых равна К и которые не большее N.
 **/

public class Task12 {
    public static void main(String[] args) {
        int k = ReaderUtil.readIntValue("Enter K: ");
        int n = ReaderUtil.readIntValue("Enter N: ");
        PrinterUtil.printOneDimArrayOfInt(fillArray(k, n));
    }

    private static int[] fillArray(int k, int n) {
        int[] array = new int[1000];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (ArithmeticUtil.sumOfDigitsInNumber(i) == k) {
                array[count++] = i;
            }
        }
        return Arrays.copyOf(array, count);
    }
}