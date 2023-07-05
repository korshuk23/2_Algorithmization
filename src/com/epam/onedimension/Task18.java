package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

import java.util.Arrays;

/**
 * 18. Дана последовательность действительных чисел a1, a2, an.
 * Указать те ее элементы, которые принадлежат отрезку [с, d].
 */

public class Task18 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(isBelongTo(array));
    }

    public static int[] isBelongTo(int[] array) {
        int c = ReaderUtil.readIntValue("Enter c value: ");
        int d = ReaderUtil.readIntValue("Enter d value: ");
        int[] arrayOfOwned = new int[array.length];
        int count = 0;
        for (int j : array) {
            if (j >= c && j <= d) {
                arrayOfOwned[count++] = j;

            }
        }
        return ArrayUtil.bubbleSort(Arrays.copyOf(arrayOfOwned, count));
    }
}