package com.mowenqc.tool.use.apache.lang;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.BitSet;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 14:39
 * @description:
 *****/
public class ArraysUtilsTest {


    @Test
    public void testArrays(){
        int [] array = new int[5];
        array[0] = 10;
        array[1] = 5;
        array[2] = 7;
        array[3] = 1;
        array[4] = 3;

        if(ArrayUtils.isEmpty(array)){
            System.out.println("array is empty");
        }
        BitSet bitSet = ArrayUtils.indexesOf(array, 1);
        System.out.println(bitSet);

        int i = ArrayUtils.lastIndexOf(array, 3);
        System.out.println(i);

        ArrayUtils.reverse(array);

        for (int i1 : array) {
            System.out.println(i1);
        }

        ArrayUtils.shuffle(array);
        for (int i1 : array) {
            System.out.println(i1);
        }
    }
}
