package com.epam.onedimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
 * большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createOneDimArrayOfInt();
        PrinterUtil.printOneDimArrayOfInt(array);
        int[] resultArray = changeMembersAndCalculateCount(array);
        PrinterUtil.printOneDimArrayOfInt(resultArray);
    }

    public static int[] changeMembersAndCalculateCount(int[] array) {
        int z = ReaderUtil.readIntValue("Enter Z value");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.min(array[i], z);
            if (array[i] == z) {
                count++;
            }
        }
        System.out.println("count of elements: " + count);
        return array;
    }
}
