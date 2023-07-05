package com.epam.decomposition;

/**
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] coordinatesXY = {{2, 7, 12, 3, 8, 1, 9, 0},
                {5, 8, 3, 6, 5, 9, 0, 7}};
        double maxDistance = findMaxDistance(coordinatesXY);
        System.out.println("Max distance = " + maxDistance);

    }

    private static double findMaxDistance(int[][] array) {
        double distance;
        double maxDistance = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int[][] currentPoint = {{array[i][0], array[i][1]},
                        {array[j][0], array[j][1]}};
                distance = distanceCounter(currentPoint);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    private static double distanceCounter(int[][] array) {
        return Math.sqrt(Math.pow((array[0][0] - array[1][0]), 2)
                + Math.pow((array[0][1] - array[1][1]), 2));
    }
}
