package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 10:59
 */
public class SimpleInsertSort extends BaseSort {

    public static void main(String[] params) {
        //初始化一个数组
        int[] array = getInitArray();
        //数组打印出来
        printArray(array);
        /**
         * 初始时，第一个元素当做已排序的序列，从下标为1的开始为未排序的序列,依次取出元素，
         * 插入到前面已排序好的序列中
         */
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//临时保存当前待排序的元素
            int index = i;//待排序元素的下标
            /**
             * 循环前面已排序的序列，从最后一个元素开始，如果比临时待排序的元素大，后移一位
             * 最后将待排序的元素插入到合适的位置
             */
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    index = j;
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            //如果发生后移，赋值
            if (index != i) {
                array[index] = tmp;
            }
        }
        printArray(array);
    }
}
