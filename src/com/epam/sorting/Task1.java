package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int k = ReaderUtil.readIntValue("Enter k: ");
        int[] firstArray = ArrayUtil.createRandOneDimArrayOfInt();
        int[] secondArray = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(combineTwoArrayByPosition(firstArray, secondArray, k));
    }

    private static int[] combineTwoArrayByPosition(int[] firstArray, int[] secondArray, int k) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int p = 0, i = 0; i < resultArray.length; p++, i++) {
            if (i == k) {
                for (int j = 0; j < secondArray.length; j++, i++) {
                    resultArray[i] = secondArray[j];
                }
            }
            resultArray[i] = firstArray[p];
        }
        return resultArray;
    }
}
