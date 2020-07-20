package cn.mowenqc.util;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 14:55
 */
public class BaseSort {

    protected static int [] getInitArray(){
        int [] array = {85,18,34,62,77,11,46,54,69,26};
        return array;
    }

    protected static void printArray(int [] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int datum : array) {
            if(stringBuilder.toString().length() > 0){
                stringBuilder.append(",");
            }
            if(datum < 10){
                stringBuilder.append(" ");
            }
            stringBuilder.append(datum);
        }
        System.out.println(stringBuilder.toString());
    }

    protected static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
