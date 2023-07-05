package com.epam.onedimension;

import com.epam.util.ArrayUtil;

/**
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из них
 */

public class Task9 {
    public static void main(String[] args) {
        int[] array = ArrayUtil.createOneDimArrayOfInt();
        System.out.println("The most popular element is: " + popularElement(array));
    }

    public static int popularElement(int[] array) {
        int[] sortedArray = ArrayUtil.bubbleSort(array);
        int count1 = 0;
        int count2 = 0;
        int pupular1 = 0;
        int popular2 = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            pupular1 = sortedArray[i];
            count1 = 0;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (pupular1 == sortedArray[j])
                    count1++;
            }
            if (count1 > count2) {
                popular2 = pupular1;
                count2 = count1;
            } else if (count1 == count2) {
                popular2 = Math.min(popular2, pupular1);
            }
        }
        return popular2;
    }
}
