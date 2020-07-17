package com.mowenqc.eah;

import entity.Student;

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
    }
}
