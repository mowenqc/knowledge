package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class SimpleSelectSort extends BaseSort {

    public static void main(String[] params) {
        //初始化一个数组{85,18,34,62,77,11,46,54,69,26}
        int[] array = getInitArray();
        printArray(array);
        //从最后一个元素开始
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = i;
            /**
             * 初始时以当前元素为最大值的下标，循环获取当前元素前面所有的元素,找出一个最大的元素的下标
             * 如果存在这样的最大值下标，将其与当前元素交换
             */
            for (int j = 0; j < i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                swap(array, i, maxIndex);
            }
        }
        printArray(array);
        System.out.println("时间复杂度O(n^2)");
    }
}
