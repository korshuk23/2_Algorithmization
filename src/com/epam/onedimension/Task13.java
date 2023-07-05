package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

import java.util.Arrays;

/**
 * 13. Даны натуральные числа а1, а2,..., аn. Указать те из них, у которых остаток от
 * деления на М равен L.
 */

public class Task13 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(remainderOfDivision(array));
    }

    public static int[] remainderOfDivision(int[] array) {
        int count = 0;
        int[] resultArray = new int[array.length];
        int m = ReaderUtil.readIntValue("Enter m: ");
        int l = ReaderUtil.readIntValue("Enter l: ");
        for (int j : array) {
            if (j % m == l) {
                resultArray[count++] = j;
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}