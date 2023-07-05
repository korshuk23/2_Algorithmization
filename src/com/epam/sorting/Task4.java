package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 4. Сортировка обменами. Дана последовательность чисел a1>a2>an.
 * Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются два соседних числа a(i) a(i+1).
 * Если a(i)>a(i+1), то делается перестановка. Так продолжается до тех пор,
 * пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sorted = bubbleSort(array);
        PrinterUtil.printOneDimArrayOfInt(sorted);
    }

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    count++;
                    ArrayUtil.swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
        System.out.println("count of iterations: " + count);
        return array;
    }
}