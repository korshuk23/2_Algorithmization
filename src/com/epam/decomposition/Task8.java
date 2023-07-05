package com.epam.decomposition;

import com.epam.util.PrinterUtil;

/**
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {2, 7, 9, 8, 2, 36, 58, 8, 57, 1, 4, 84, 34, 67, 54};
        PrinterUtil.printOneDimArrayOfInt(array);
        PrinterUtil.printOneDimArrayOfInt(sumArray(array));
    }

    private static int[] sumArray(int[] array) {
        int[] resArr = new int[array.length / 3];
        for (int i = 0, h = 0; i < resArr.length; i++, h += 3) {
            resArr[i] = sumThreeNumbers(array, h);
        }
        return resArr;
    }

    private static int sumThreeNumbers(int[] array, int startIndex) {
        int sum = 0;
        for (int i = startIndex; i < startIndex + 3; i++) {
            sum += array[i];
        }
        return sum;
    }
}
