package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...bm,
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm  в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 **/
public class Task7 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 3, 5, 7, 9, 11};
        int[] secondSequence = {2, 4, 6, 8, 10};
        PrinterUtil.printOneDimArrayOfInt(firstSequence);
        PrinterUtil.printOneDimArrayOfInt(secondSequence);
        PrinterUtil.printOneDimArrayOfInt(placeToInsert(firstSequence, secondSequence));
    }

    public static int[] placeToInsert(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            int index = ArrayUtil.binarySearch(arr3, arr2[j], arr3.length);
            System.out.printf("ind[%d]\t", index);
            for (int k = arr3.length - 1; k > index; k--) {
                arr3[k] = arr3[k - 1];
            }
            arr3[index] = arr2[j];
        }
        System.out.println();
        return arr3;
    }
}