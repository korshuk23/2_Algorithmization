package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 3. Сортировка выбором. Дана последовательность чисел a1<a2<an.
 * Требуется переставить элементы так, чтобы они были расположены
 * по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        PrinterUtil.printOneDimArrayOfInt(firstSequence);
        int[] sorted = ArrayUtil.selectionSort(firstSequence);
        System.out.println("Selection sort in descending order:");
        PrinterUtil.printOneDimArrayOfInt(sorted);
    }
}