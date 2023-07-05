package com.epam.decomposition;

/**
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        sumFactorialOfOddNumbers();
    }

    private static void sumFactorialOfOddNumbers() {
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = i; j > 0; j--) {
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }
        System.out.println(sum);
    }
}