package com.epam.decomposition;

import com.epam.util.PrinterUtil;

/**
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        int n = 40;
        int[][] twinNumbers = findTwin(40);
        System.out.printf("Numbers \"Twins\" on the distance from %d till %d:%n", n, n * 2);
        PrinterUtil.printMultiDimArray(twinNumbers);
    }

    private static int[][] findTwin(int n) {
        int[][] twinNumbers = new int[n][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }
}