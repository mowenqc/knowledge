package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: huangkai
 * @createTime: 2020/7/17 15:37
 */
public class QuickSort extends BaseSort {

    public static void main(String[] args) {
        int []array = getInitArray();
        printArray(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void quickSort(int []array, int left, int right){
        int tmp = array[left];
        int l = left + 1;
        int r = right;
        while (l < r){
            while (l < r && array[r] > tmp){
                r--;
            }
            while (l < r && array[l] < tmp){
                l++;
            }
            if(l < r){
                swap(array, l, r);
            }
        }
        if(tmp > array[l]){
            swap(array, left, l);
        }
        if(l - left > 1){
            quickSort(array, left, l -1);
        }
        if(right - l > 1){
            quickSort(array,l + 1, right);
        }
    }
}
