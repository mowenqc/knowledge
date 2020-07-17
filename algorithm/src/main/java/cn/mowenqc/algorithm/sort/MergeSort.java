package cn.mowenqc.algorithm.sort;

import cn.mowenqc.util.BaseSort;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 15:37
 */
public class MergeSort extends BaseSort {

    public static void main(String[] args) {
        int []array = getInitArray();
        printArray(array);
        int middle = array.length/2;
        int high = array.length - 1;
        int low = 0;
        mergeSort(array, low, middle, middle + 1, high);
        printArray(array);
    }

    private static void mergeSort(int [] array, int leftLow,int leftHigh, int rightLow, int rightHigh){
        if(leftHigh - leftLow >= 1){
            int leftMiddle = (leftLow + leftHigh)/2;
            mergeSort(array, leftLow, leftMiddle, leftMiddle + 1, leftHigh);
        }
        if(rightHigh - rightLow >= 1){
            int rightMiddle = (rightHigh + rightLow)/2;
            mergeSort(array, rightLow, rightMiddle, rightMiddle + 1, rightHigh);
        }
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
        while (left <= leftHigh){
            mergeData[i++] = array[left++];
        }
        while (right <= rightHigh){
            mergeData[i++] = array[right++];
        }
        left = leftLow;
        for (int j = 0; j < mergeData.length;j++){
            array[left++] = mergeData[j];
        }
        System.out.println(1);
    }
}
