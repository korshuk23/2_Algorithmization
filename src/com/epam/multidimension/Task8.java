package com.epam.multidimension;

import com.epam.util.ArrayUtil;
import com.epam.util.PrinterUtil;
import com.epam.util.ReaderUtil;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все
 * элементы одного столбца поставить на соответствующие им позиции другого, а его
 * элементы второго переместить в первый. Номера столбцов вводит пользователь с
 * клавиатуры.
 */
public class Task8 {
    public static void main(String[] args) {
        int[][] array = ArrayUtil.randomArrOfArrOfInt();
        int i1 = ReaderUtil.readIntValue("Column number: ") - 1;
        int i2 = ReaderUtil.readIntValue("Replace with: ") - 1;
        PrinterUtil.printMultiDimArray(array);
        PrinterUtil.printMultiDimArray(changeColumns(array, i1, i2));
    }

    private static int[][] changeColumns(int[][] array, int i1, int i2) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i][i1];
            array[i][i1] = array[i][i2];
            array[i][i2] = tmp;
        }
        return array;
    }
}
