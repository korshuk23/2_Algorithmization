package com.epam.util;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    private static final Random random = new Random();

    public static int[] createRandOneDimArrayOfInt() {
        int n = ReaderUtil.readIntValue("Enter array dimension: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static double[] createRandOneDimArrayOfDouble() {
        int n = ReaderUtil.readIntValue("Enter array dimension: ");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10 - 5;
        }
        return array;
    }

    public static int[] createOneDimArrayOfInt() {
        int n = ReaderUtil.readIntValue("Enter array dimension");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ReaderUtil.readIntValue("Enter [ " + i + " ] element");

        }
        return array;
    }

    public static double[] createOneDimArrayOfDouble() {
        int n = ReaderUtil.readIntValue("Enter array dimension");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ReaderUtil.readIntValue("Enter [ " + i + " ] element");

        }
        return array;
    }

    public static int arrayMin(int[] array) {
        int min = array[0];
        for (int mas : array) {
            if (min > mas) {
                min = mas;
            }
        }
        return min;
    }

    public static int arrayMax(int[] array) {
        int max = array[0];
        for (int mas : array) {
            if (max < mas) {
                max = mas;
            }
        }
        return max;
    }

    public static int findMultiDimArrayMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int findMultiDimArrayMin(int[][] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int[][] randomArrOfArrOfInt() {
        int n = ReaderUtil.readIntValue("Enter array dimension");
        Random random = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) - 2;
            }
        }
        return array;
    }

    public static double[][] randomArrOfArrOfDouble() {
        int n = ReaderUtil.readIntValue("Enter array dimension");
        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.random() * 10 - 5;
                ;
            }
        }
        return array;
    }

    public static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    // bubble sort in ascending order
    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
        return array;
    }

    // selection sort in descending order
    public static int[] selectionSort(int[] array) {
        int max;
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            swap(array, i, max);
        }
        return array;
    }

    // insertion sort in ascending order
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j >= 0 && current < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
        return array;
    }

    public static int binarySearch(int[] arr, int numberToSearch, int lastInd) {
        int low = 0;
        int high = lastInd - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (numberToSearch > arr[middle]) {
                low = middle + 1;
            } else if (numberToSearch < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }

    // shell sorting in ascending order
    public static int[] shellSort(int[] array) {
        int n = array.length;
        int counter = 0;
        for (int h = n / 2; h >= 1; h /= 2) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    ArrayUtil.swap(array, j, j - h);
                    counter++;
                }
            }
        }
        System.out.println("iterations " + counter);
        return array;
    }

    //quick sorting in ascending order
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) return;
        int partition = partitionVer2(array, start, end);
        printSortStep(array, start, end, partition);
        quickSort(array, start, partition - 1);
        quickSort(array, partition, end);
    }

    private static int partitionVer1(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, end);
        return i;
    }

    public static int partitionVer2(int[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;
        int pivot = array[start + (end - start) / 2];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(Arrays.toString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + Arrays.toString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + Arrays.toString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

    //mergeSort
    public static void mergeSort(int[] array) {
        int middle = array.length / 2;
        if (array.length == 1) return;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j++] = array[i];
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            array[k++] = leftArray[i] <= rightArray[j] ? leftArray[i++] : rightArray[j++];
        }
        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }

    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
