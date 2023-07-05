package com.epam.decomposition;

import com.epam.util.ArithmeticUtil;
import com.epam.util.ReaderUtil;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a: ");
        int b = ReaderUtil.readIntValue("Enter b: ");
        int c = ReaderUtil.readIntValue("Enter c: ");
        int[] array = {a, b, c};
        System.out.println("Is numbers prime: " + isNumbersPrime(array));
    }

    private static boolean isNumbersPrime(int[] array) {
        int count = 0;
        for (int element : array) {
            if (ArithmeticUtil.isSimple(element)) {
                count++;
            }
        }
        return count == array.length;
    }
}