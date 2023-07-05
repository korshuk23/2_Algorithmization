package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;

/**
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 4;
        int[] numbers = {1234, 2222, 11, 357, 3251, 1111, 1357, 12, 3366, 8248, 123, 0, 5964};
        int sumOfOdd = sumOfOddDigitsNumber(numbers, n);
        int countInSum = countOfEvenDigits(sumOfOdd);
        System.out.println("sum of numbers with all odd digits " + sumOfOdd
                + "\ncount of even digits in sum " + countInSum);
    }

    private static int sumOfOddDigitsNumber(int[] numbers, int number) {
        int sum = 0;
        for (int i : numbers) {
            if (isNumberTrue(number, i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static boolean isNumberTrue(int number, int number1) {
        int countOfDigits = ArithmeticUtil.countOfDigitsInNumber(number1);
        if (number != countOfDigits) {
            return false;
        }
        return isAllDigitsOdd(number1);
    }

    static boolean isAllDigitsOdd(int number) {
        while (number > 0) {
            if (number % 2 != 0) {
                number = number / 10;
            } else {
                return false;
            }
        }
        return true;
    }

    static int countOfEvenDigits(int number) {
        int counter = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                counter++;
            }
            number = number / 10;
        }
        return counter;
    }
}