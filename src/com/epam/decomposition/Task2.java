package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;
import com.epam.util.ReaderUtil;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a: ");
        int b = ReaderUtil.readIntValue("Enter b: ");
        int c = ReaderUtil.readIntValue("Enter c: ");
        int d = ReaderUtil.readIntValue("Enter d: ");
        int[] array = {a, b, c, d};
        int gcd = ArithmeticUtil.findGCDInArray(array);
        System.out.println("Greatest common divisor = " + gcd);
    }

}