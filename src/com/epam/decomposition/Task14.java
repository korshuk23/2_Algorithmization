package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

import java.util.Arrays;

/**
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {
        int k = ReaderUtil.readIntValue("Enter K: ");
        PrinterUtil.printOneDimArrayOfInt(findArmstrongNumbers(k));
    }

    private static int[] findArmstrongNumbers(int k) {
        int[] armNumbers = new int[50];
        int counter = 0;
        for (int i = 1; i < k; i++) {
            if (isArmNumber(i)) {
                armNumbers[counter++] = i;
            }
        }
        return Arrays.copyOf(armNumbers, counter);
    }

    private static boolean isArmNumber(int i) {
        int countOfDigits = ArithmeticUtil.countOfDigitsInNumber(i);
        int copyI = i;
        int sum = 0;
        if (i >= 1 && i <= 9) {
            return true;
        }
        while (copyI != 0) {
            sum += Math.pow(copyI % 10, countOfDigits);
            copyI /= 10;
        }
        return sum == i;
    }
}
