package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class SimpleSelectSort extends BaseSort {

    public static void main(String[] params) {
        int[] array = {85, 8, 34, 62, 87, 11, 36, 64, 89, 13};
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, i, index);
            }
        }
        printArray(array);
        System.out.println("时间复杂度O(n^2)");

    }


}
