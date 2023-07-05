package com.epam.util;

public class PrinterUtil {
    public static void printOneDimArrayOfInt(int[] array) {
        for (int arr : array) {
            System.out.print("(" + arr + ") ");
        }
        System.out.println();
    }

    public static void printOneDimArrayOfDouble(double[] array) {
        for (double arr : array) {
            System.out.printf("(%.2f) ", arr);
        }
        System.out.println();
    }

    public static void printMultiDimArray(int[][] array) {
        for (int[] row : array) {
            for (int column : row) {
                System.out.printf("%7d", column);
            }
            System.out.println();
        }
        System.out.println();
    }
}
