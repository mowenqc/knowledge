package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 15:37
 */
public class MergeSort extends BaseSort {

    public static void main(String[] args) {
        //初始化数据{85,18,34,62,77,11,46,54,69,26 };
        int []array = getInitArray();
        printArray(array);
        int middle = array.length/2;
        int high = array.length - 1;
        int low = 0;
        /**
         * 将待排序的序列划分了两部分，这是二路排序的思路，左右两边都是已排序的序列，将其合并成为一个排序的序列
         * 左右两边明显不是有序的，所以递归的处理，直到左右两边都是有序的，也就是在左右两个的元素个数为1时，进行第一次合并
         */
        mergeSort(array, low, middle, middle + 1, high);
        printArray(array);
    }

    private static void mergeSort(int [] array, int leftLow,int leftHigh, int rightLow, int rightHigh){
        //如果左边的元素超过一个，继续下分，递归处理
        if(leftHigh - leftLow >= 1){
            int leftMiddle = (leftLow + leftHigh)/2;
            mergeSort(array, leftLow, leftMiddle, leftMiddle + 1, leftHigh);
        }
        //如果右边的元素个数超过一个，继续下分，递归处理
        if(rightHigh - rightLow >= 1){
            int rightMiddle = (rightHigh + rightLow)/2;
            mergeSort(array, rightLow, rightMiddle, rightMiddle + 1, rightHigh);
        }
        /**
         * 将左右两边的有序序列进行归并排序，新建一个中间数组，大小为两边元素之和
         * 从左向右选择，将从小到大依次放入中间数组中，最后将中间数组中的元素回写到原数组中
         */
        int left = leftLow;
        int right = rightLow;
        int [] mergeData = new int[leftHigh - leftLow + 1 + rightHigh + 1 - rightLow];
        int i = 0;
        while (left <= leftHigh && right <= rightHigh){
            if(array[left] < array[right]){
                mergeData[i++] = array[left];
                left++;
            }
            else {
                mergeData[i++] = array[right];
                right++;
            }
        }
        //如果左侧的还未处理完，将左侧剩余的全部放在中间数组中
        while (left <= leftHigh){
            mergeData[i++] = array[left++];
        }
        //如果右侧的还未处理完，将右侧剩余的全部放在中间数组中
        while (right <= rightHigh){
            mergeData[i++] = array[right++];
        }
        left = leftLow;
        //将中间数组中的数据回写到原数组中，中间数组中的全部排序
        for (int j = 0; j < mergeData.length;j++){
            array[left++] = mergeData[j];
        }
    }
}
