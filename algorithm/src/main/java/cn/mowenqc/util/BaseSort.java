package cn.mowenqc.util;

/**
 * @description: knowledge_parent
 * @author: huangkai
 * @createTime: 2020/7/17 14:55
 */
public class BaseSort {


    protected static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    protected static void printArray(int [] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int datum : array) {
            if(stringBuilder.toString().length() > 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(datum);
        }
        System.out.println(stringBuilder.toString());
    }

    protected static int [] getInitArray(){
        int [] array = {85,8,34,62,87,11,36,64,89,13};
        return array;
    }
}
