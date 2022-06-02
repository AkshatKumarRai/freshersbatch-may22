package io.capgemini.junit;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxFinder {
    public static int getMaxValue(int[] array) {
        int value = Integer.MIN_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }

    public static int getMinValue(int[] array) {
        int value = Integer.MAX_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i=0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;
    }   
}

