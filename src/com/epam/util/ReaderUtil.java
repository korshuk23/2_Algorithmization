package com.epam.util;

import java.util.Scanner;

public class ReaderUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readIntValue(String prompt) {
        System.out.print(prompt + " ");
        int counter = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Error, expected Int value. Try again: ");
            scanner.next();
            if (counter++ > 5) {
                System.exit(1);
            }
        }
        return scanner.nextInt();
    }

    public static double readDoubleValue(String prompt) {
        System.out.println(prompt);
        int counter = 0;
        while (!scanner.hasNextDouble()) {
            System.out.println("Error, expected Double value. Try again: ");
            scanner.next();
            if (counter++ > 5) {
                System.exit(1);
            }
        }
        return scanner.nextDouble();
    }
}
