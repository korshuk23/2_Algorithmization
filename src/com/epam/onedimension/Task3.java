package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в
 * нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        double[] array = ArrayUtil.createOneDimArrayOfDouble();
        PrinterUtil.printOneDimArrayOfDouble(array);
        printCount(array);
    }

    public static void printCount(double[] array) {
        int[] result = new int[3];
        for (double arr : array) {
            if (arr < 0) {
                result[0]++;
            } else if (arr == 0) {
                result[1]++;
            } else if (arr > 0) {
                result[2]++;
            }
        }
        System.out.println("\nCount of negative: " + result[0]);
        System.out.println("Count of zero: " + result[1]);
        System.out.println("Count of positive: " + result[2]);
    }
}