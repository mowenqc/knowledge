package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: huangkai
 * @createTime: 2020/7/17 10:59
 */
public class BubbleSort extends BaseSort {

    public static void main(String[] params){
        int[] array = {85,8,34,62,87,11,36,64,89,13};
        printArray(array);
        int length = array.length;
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j,j+1);
                }
            }
        }
        printArray(array);
    }
}
