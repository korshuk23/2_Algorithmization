package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

import java.util.Arrays;

/**
 * 8. Дана последовательность целых чисел а1,а2,..., аn. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn)
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(arrayWithoutMin(array));
        PrinterUtil.printOneDimArrayOfInt(array);
    }

    public static int[] arrayWithoutMin(int[] array) {
        int min = ArrayUtil.arrayMin(array);
        int count = 0;
        int[] resultArray = new int[array.length];
        for (int mas : array) {
            if (mas != min) {
                resultArray[count++] = mas;
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}