package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

import java.util.Arrays;

public class CountSort extends BaseSort {
    public static void main(String[] params) {
        int[] array = getInitArray();
        printArray(array);
        countSort(array);
        printArray(array);
    }

    private static void countSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int max = array[0];
        int min = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }
        int[] middleArray = new int[max - min + 2];
        Arrays.fill(middleArray, 0);
        //在这里值考虑min大于0的情况
        int bias = min - 1;
        for (int item : array) {
            middleArray[item - bias]++;
        }
        int index = 0;
        for (int i = 0; i < middleArray.length; i++) {
            if (middleArray[i] > 0) {
                array[index++] = i + bias;
            }
        }
    }

}
