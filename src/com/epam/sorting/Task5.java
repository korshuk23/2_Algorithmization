package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2, ..., an.
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 * Пусть a1, a2, ai - упорядоченная последовательность, т. е. a1<a2<an.
 * Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 8, 5, 7, 10, 9};
        PrinterUtil.printOneDimArrayOfInt(array);
        int[] sorted = shellSort(array, 4);
        PrinterUtil.printOneDimArrayOfInt(sorted);
    }

    private static int[] shellSort(int[] sequence, int sortFrom) {
        for (int i = sortFrom; i < sequence.length; i++) {
            int numberToSearch = sequence[i];
            int indexToInsert = ArrayUtil.binarySearch(sequence, numberToSearch, i);
            for (int j = i; j > indexToInsert; j--) {
                sequence[j] = sequence[j - 1];
            }
            sequence[indexToInsert] = numberToSearch;
        }
        return sequence;
    }
}