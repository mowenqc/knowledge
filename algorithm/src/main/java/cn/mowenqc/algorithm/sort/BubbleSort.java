package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class BubbleSort extends BaseSort {

    public static void main(String[] params){
        int[] array = getInitArray();
        printArray(array);
        int length = array.length;
        /**
         * 循环n次，每次将当前范围内的最大元素冒泡的到最后面
         */
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //如果前一个元素比后一个元素大，交换两个元素的位置
                if (array[j] > array[j+1]) {
                    swap(array, j,j+1);
                }
            }
        }
        printArray(array);
    }
}
