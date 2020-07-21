package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class HellInsertSort extends BaseSort {

    public static void main(String[] params) {
        int[] array = getInitArray();
        printArray(array);
        int length = array.length;
        //确定步长
        for (int i = length / 2; i > 0; i = i / 2) {
            for (int j = i; j < length; j = j + i) {
                int tmp = array[j];
                int index = j;
                for (int k = j; k >= 0; k = k - i) {
                    if (k - i < 0) {
                        break;
                    }
                    if (array[k - i] > tmp) {
                        index = k - i;
                        array[k] = array[k - i];
                    } else {
                        break;
                    }
                }
                array[index] = tmp;
            }
        }
        printArray(array);

    }
}
