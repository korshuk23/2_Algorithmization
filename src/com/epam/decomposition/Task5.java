package com.epam.decomposition;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

public class Task5 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        System.out.println("second max element is: " + searchSecondLargest(array));
    }

    private static int searchSecondLargest(int[] array) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}
