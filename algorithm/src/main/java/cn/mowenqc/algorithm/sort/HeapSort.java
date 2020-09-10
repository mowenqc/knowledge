package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 15:37
 */
public class HeapSort extends BaseSort {

    public static void main(String[] args) {
        int[] array = getInitArray();
        printArray(array);
        heapSort(array);
        printArray(array);
    }

    private static void heapSort(int[] array) {
        //构建大根堆
        buildHeapTree(array);
        for (int i = array.length - 1; i > 0; i--) {
            //收尾元素交换元素
            swap(array, 0, i);
            //重新建构大根堆
            heapify(array, 0, i);
            printArray(array);
        }
    }

    private static void buildHeapTree(int[] array) {
        //从后向前，从第一个非叶子节点开始，将每个节点都是大根堆
        for (int i = array.length / 2; i >= 0; i--) {
            heapify(array, i, array.length);
        }
    }

    private static void heapify(int[] array, int i, int length) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;
        //找出子节点的最大值，从当前值交换，重新构建交换后的子节点
        if (left < length && array[left] > array[maxIndex]) {
            maxIndex = left;
        }
        if (right < length && array[right] > array[maxIndex]) {
            maxIndex = right;
        }
        if (maxIndex != i) {
            swap(array, i, maxIndex);
            heapify(array, maxIndex, length);
        }
    }

}
