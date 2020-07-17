package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class SimpleInsertSort extends BaseSort {

    public static void main(String[] params) {
        int[] array = {85, 8, 34, 62, 87, 11, 36, 64, 89, 13};
        printArray(array);
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    index = j;
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            if (index != i) {
                array[index] = tmp;
            }
        }
        printArray(array);

    }
}
