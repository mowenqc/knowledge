package com.mowenqc.eah;

import entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 */
public class OverrideEqualsAndHashCode {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStuNo("2020");

        Student student2 = new Student();
        student2.setStuNo("2020");
        student2.setAge("30");

        System.out.println("is equals :" + student1.equals(student2));

        String s = Long.toHexString(12000L);
        /**
         * 用到的工具类是java.util.Arrays
         */
        List<Integer> intArray = Arrays.asList(1, 2, 3);
        System.out.println(intArray);
        int [] intarray = {1,2};
        System.out.println(Arrays.toString(intarray));
    }
}
