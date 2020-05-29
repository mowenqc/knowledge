package com.mowen.base;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/28 15:39
 * @description:
 *****/
public class ArraysTest {

    @Test
    public void testArrays(){
        int [] idArr = new int[]{1,2,3,4,5,9,2,1,5};
        int[] ints = Arrays.copyOf(idArr, 2);

        int[] ofRange = Arrays.copyOfRange(idArr, 1, 2);

        Arrays.sort(idArr);
        System.out.println(idArr);
        ArrayUtils.reverse(idArr);
        System.out.println(idArr);

    }
}
