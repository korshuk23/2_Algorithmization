package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 16. Определить количество элементов последовательности натуральных чисел,
 * кратных числу М и заключенных в промежутке от L до N.
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        int count = countOfMultiplesValues(array);
        System.out.println("Count of multiples values: " + count);
    }

    public static int countOfMultiplesValues(int[] array) {
        int count = 0;
        int m = ReaderUtil.readIntValue("Enter M value");
        int l = ReaderUtil.readIntValue("Enter L value");
        int n = ReaderUtil.readIntValue("Enter N value");
        for (int j : array) {
            count = (j % m == 0 && j > l && j < n) ? count + 1 : count;
        }
        return count;
    }
}