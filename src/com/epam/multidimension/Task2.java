package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;

/**
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        PrinterUtil.printMultiDimArray(array);
        elementsOnDiagonal(array);
    }

    private static void elementsOnDiagonal(int[][] array) {
        System.out.print("Diagonal elements : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}
