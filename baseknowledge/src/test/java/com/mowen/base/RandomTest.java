package com.mowen.base;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

    @Test
    public void testGenerateRandomList(){
        int i = 1;
        Random random = new Random();
        Set<Integer> setList = new HashSet<>();
        int j = 0;
        while (true){
            if(setList.size() == 100){
                break;
            }
           /* random.setSeed(i++);*/
            int intType = random.nextInt(2000);
            setList.add(intType);
            System.out.println(j++);
        }
    }
}
