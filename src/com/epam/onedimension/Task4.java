package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
 * наименьший элементы
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createRandOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(changeMaxMin(array));
    }

    public static int[] changeMaxMin(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = ArrayUtil.arrayMin(array);
            maxIndex = ArrayUtil.arrayMax(array);
        }
        ArrayUtil.swap(array, maxIndex, minIndex);
        return array;
    }
}