package com.mowen.base;

import org.junit.Test;

import java.util.Random;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/27 8:46
 * @description:
 *****/
public class RandomTest {

    @Test
    public void testRandom(){
        int i = 10;
        Random random = new Random();
        for (int j = 1; j < i+1;j++){
            System.out.println(random.nextInt(10));
        }
    }

    @Test
    public void testMathRandom(){
        for (int i = 0 ; i< 10;i++){
            System.out.println((int) (Math.random() * 10));
        }
    }
}
