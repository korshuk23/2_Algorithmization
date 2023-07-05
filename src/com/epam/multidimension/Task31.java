package com.epam.multidimension;

import com.epam.util.PrinterUtil;

/**
 * 31. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
 * была ровно одна единица, и вывести на экран.
 */
public class Task31 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][0] = 1;
            }
        }
        PrinterUtil.printMultiDimArray(array);
    }
}