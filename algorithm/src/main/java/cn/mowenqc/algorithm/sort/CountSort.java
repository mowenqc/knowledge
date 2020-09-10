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
        //新建一个数组，能容纳最大元素
        int[] middleArray = new int[max - min + 2];
        Arrays.fill(middleArray, 0);
        //在这里值考虑min大于0的情况
        int bias = min - 1;
        //统计元素的个数
        for (int item : array) {
            middleArray[item - bias]++;
        }
        int index = 0;
        //将统计结果大于0的数据回写到原数组中
        for (int i = 0; i < middleArray.length; i++) {
            if (middleArray[i] > 0) {
                array[index++] = i + bias;
            }
        }
    }

}
