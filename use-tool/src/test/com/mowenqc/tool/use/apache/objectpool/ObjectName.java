package com.mowenqc.tool.use.apache.objectpool;

import java.util.Random;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/1 17:26
 * @description:
 *****/
public class ObjectName {

    private int code;

    public ObjectName() {
        Random random = new Random(System.nanoTime());
        code = random.nextInt(100000);
        System.out.println("new create object~ code = " + code);


    }

    public void print() {
        System.out.println("code = " + code + " see hello world");
    }

    public void print(String xx){
        System.out.println("code = " + code + " see " + xx);
    }
}
