package com.epam.util;

import java.util.Arrays;

public class ArithmeticUtil {
    public static boolean isSimple(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigitsInNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int countOfDigitsInNumber(int n) {
        int counter = 0;
        for (int i = n; i != 0; i /= 10) {
            counter++;
        }
        return counter;
    }

    public static int findGCD(int a, int b) {
        int gcd;
        if (a == 0) {
            gcd = b;
        } else if (b == 0) {
            gcd = a;
        } else {
            gcd = evklidAlg(a, b);
        }
        return gcd;
    }

    public static int findGCDInArray(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = findGCD(gcd, array[i]);
        }
        return gcd;
    }

    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return a * b / gcd;
    }

    public static int findLCMInArray(int[] array) {
        Arrays.sort(array);
        int lcm = array[0];
        for (int i = 1; i < array.length; i++) {
            lcm = findLCM(lcm, array[i]);
        }
        return lcm;
    }

    //Evklid algorithm
    public static int evklidAlg(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    //Evklid algorithm with recursion
    public static int evklidAlgRecursive(int a, int b) {
        return b == 0 ? a : evklidAlgRecursive(b, a % b);
    }
}
