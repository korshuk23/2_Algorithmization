package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

import java.util.Arrays;

/**
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа,
 * для которых аi > i.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(printSomeNumbers(array));
    }

    public static int[] printSomeNumbers(int[] array) {
        int count = 0;
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                resultArray[count++] = array[i];
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}