package com.epam.onedimension;

import com.epam.util.PrinterUtil;

import java.util.Arrays;

/**
 * 19. В целочисленной последовательности есть нулевые элементы. Создать массив из
 * номеров этих элементов
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 0, 4, 0, 0, 5, 0, 4, 9, 0};
        int[] resultArray = resultArrayOfIndex(array);
        PrinterUtil.printOneDimArrayOfInt(resultArray);
    }

    public static int[] resultArrayOfIndex(int[] array) {
        int[] resultArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                resultArray[count++] = i;
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}
