package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        int number = 12;
        int count = countOfIterations(number);
        System.out.println("int count of iterations " + count);

    }

    private static int countOfIterations(int number) {
        int sumOfDigitsInNumber = ArithmeticUtil.sumOfDigitsInNumber(number);
        int counter = 0;
        while (number > 0) {
            counter++;
            number -= sumOfDigitsInNumber;
        }
        return counter;
    }
}