package cn.mowenqc.datastructure;

import cn.mowenqc.util.BaseSort;
import cn.mowenqc.util.RandomUtil;

import java.util.Arrays;

public class ArrayMain extends BaseSort {

    public static void main(String[] args) {
        int [] intArray = new int[10];
        Arrays.fill(intArray,0);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = RandomUtil.randomInt(i,1000);
        }
        for (int i : intArray) {
            System.out.println(i);
        }
        printArray(intArray);
    }
}
