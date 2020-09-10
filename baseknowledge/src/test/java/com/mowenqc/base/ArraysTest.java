package com.mowenqc.base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/28 15:39
 * @description:
 *****/
public class ArraysTest {

    @Test
    public void testArrays(){
        int [] idArr = new int[]{1,2,3,4,5,9,2,1,5};
        int[] asDouble = Arrays.stream(idArr).filter(i -> i >= 5).toArray();
        String string = Arrays.toString(asDouble);
        System.out.println(string);
        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.add(5);
        integers.add(12334);
        Arrays.sort(idArr);
       // Arrays.fill(idArr,0);
        System.out.println(Arrays.toString(idArr));
        Arrays.equals(idArr,idArr);
        Arrays.copyOf(idArr, 2);
        Arrays.copyOfRange(idArr,1,4);
    
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        list.add(5);java.lang.UnsupportedOperationException
        //list.remove(1);java.lang.UnsupportedOperationException
        System.out.println(list);
        List<Integer> collect = list.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(collect);
        int i = list.stream().reduce(0, (a, b) -> a + b).intValue();
        System.out.println(i);
    }
}
