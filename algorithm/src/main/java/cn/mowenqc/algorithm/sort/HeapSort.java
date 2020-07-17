package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 15:37
 */
public class HeapSort extends BaseSort {

    public static void main(String[] args) {
        int []array = getInitArray();
        printArray(array);
        //构建小根堆
        buildMinHeapSort(array);
        printArray(array);
    }

    private static void buildMinHeapSort(int []array){

    }
}
