package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;
import com.epam.util.ReaderUtil;

/**
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(А,В) = (А*В)/(НОД(А,В)).
 */
public class Task1 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a: ");
        int b = ReaderUtil.readIntValue("Enter b: ");
        int gcd = ArithmeticUtil.findGCD(a, b);
        int lcm = ArithmeticUtil.findLCM(a, b);
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }


}