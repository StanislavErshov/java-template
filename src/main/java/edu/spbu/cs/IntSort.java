package edu.spbu.cs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
    public static void sort(int[] array) {
        if (array.length == 1) {
            return;
        } else {
            int lenLeft = array.length / 2;
            int lenRight = (array.length + 1) / 2;
            int[] arrayLeft = new int[lenLeft];
            int[] arrayRight = new int[lenRight];
            System.arraycopy(array, 0, arrayLeft, 0, lenLeft);
            System.arraycopy(array, lenLeft, arrayRight, 0, lenRight);
            sort(arrayLeft);
            sort(arrayRight);
            int i = 0;
            int iLeft = 0;
            int iRight = 0;
            while (iLeft < lenLeft && iRight < lenRight) {
                if (arrayLeft[iLeft] <= arrayRight[iRight]) {
                    array[i] = arrayLeft[iLeft];
                    iLeft++;
                } else {
                    array[i] = arrayRight[iRight];
                    iRight++;
                }
                i++;
            }
            while (iLeft < lenLeft) {
                array[i] = arrayLeft[iLeft];
                i++;
                iLeft++;
            }
            while (iRight < lenRight) {
                array[i] = arrayRight[iRight];
                i++;
                iRight++;
            }
        }
    }

    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }
}
