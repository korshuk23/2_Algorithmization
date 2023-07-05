package com.epam.onedimension;

import com.epam.util.PrinterUtil;

/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(shiftZeroElements(array));
    }

    public static int[] removeEverySecond(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] shiftZeroElements(int[] array) {
        int[] resultArray = removeEverySecond(array);
        for (int j = 0, i = 0; i < resultArray.length; i++) {
            if (resultArray[i] != 0) {
                if (j < i) {
                    int tmp = resultArray[i];
                    resultArray[i] = resultArray[j];
                    resultArray[j] = tmp;
                }
                j++;
            }
        }
        return resultArray;
    }
}
