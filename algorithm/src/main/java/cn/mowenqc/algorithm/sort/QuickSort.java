package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
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
        int tmp = array[left];//以最左边的元素最为临界值
        int l = left + 1;
        int r = right;
        while (l < r){
            while (l < r && array[r] > tmp){
                r--;//从右向左，找出一个小于临界值的元素
            }
            while (l < r && array[l] < tmp){
                l++;//从左向右，找出一个大于临界值得元素
            }
            if(l < r){
                swap(array, l, r);//将大的放右边，小的放左边
            }
        }
        if(tmp > array[l]){
            //将临界值放在临界的位置，左边小于临界值，右边大于临界值，这个位置
            //这个位置就是排序后的位置，l的位置就是临界值的位置
            swap(array, left, l);
        }
        //用同样的方法对左边和右边的元素进行划分，直到左右两边都完全处理为止
        if(l - left > 1){
            quickSort(array, left, l -1);
        }
        if(right - l > 1){
            quickSort(array,l + 1, right);
        }
    }
}
