package com.epam.sorting;

import com.epam.util.ArithmeticUtil;

import java.util.Arrays;

/**
 * Даны дроби(p1/q1),(p2/q2),...(pn/qn) (pi , qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 **/

public class Task8 {
    public static void main(String[] args) {
        int[] numerator = {2, 4, 6, 3, 2};
        int[] denominator = new int[]{3, 6, 6, 4, 2};
        String[] arr1 = formattedFraction(numerator, denominator);
        System.out.println(Arrays.toString(arr1));
        String[] arr2 = lcmOfTheFraction(numerator, denominator);
        System.out.println(Arrays.toString(arr2));
    }

    private static String[] formattedFraction(int[] num, int[] den) {
        String[] arr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i] = String.format("%s/%s", num[i], den[i]);

        }
        return arr;
    }

    private static String[] lcmOfTheFraction(int[] num, int[] den) {
        String[] arr = new String[num.length];
        int[] denCopy = Arrays.copyOf(den, den.length);
        int lcm = ArithmeticUtil.findLCMInArray(denCopy);
        sortNumerator(num, den, lcm);
        for (int j = 0, i = 0; j < num.length; j++, i++) {
            den[i] = lcm;
            arr[i] = String.format("%s/%s", num[j], den[i]);
        }
        return arr;
    }

    private static void sortNumerator(int[] num, int[] den, int lcm) {
        for (int j = 0, i = 0; j < num.length; j++, i++) {
            num[j] = num[j] * (lcm / den[j]);
        }
        Arrays.sort(num);
    }

}