package com.epam.multidimension;

import com.epam.util.ReaderUtil;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * A[I, J] = sin((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {
        int n = ReaderUtil.readIntValue("Enter n: ");
        double[][] array = new double[n][n];
        arrayFunction(array);
        int count = countOfPositiveElements(array);
        System.out.println("\n Count of positive numbers: " + count);
    }

    private static void arrayFunction(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((i * i - j * j) / (1.0 * array.length));
                System.out.printf("%.2f  ", array[i][j]);
            }
            System.out.println();
        }
    }

    private static int countOfPositiveElements(double[][] array) {
        int count = 0;
        for (double[] iArr : array) {
            for (double jArr : iArr) {
                if (jArr >= 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
