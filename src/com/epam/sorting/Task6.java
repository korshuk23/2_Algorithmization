package com.epam.sorting;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
 * то продвигаются на один элемент вперед. Если a(i)>a(i+1), то производится перестановка и сдвигаются
 * на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] firstSequence = {10, 4, 8, 6, 7, 5, 9, 1, 2, 3};
        PrinterUtil.printOneDimArrayOfInt(firstSequence);
        PrinterUtil.printOneDimArrayOfInt(ArrayUtil.shellSort(firstSequence));
    }


}