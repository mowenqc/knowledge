package com.mowen.eah;

import com.mowen.ic.InnerClass;
import entity.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class OverrideEqualsAndHashCode {

    public static void main(String[] args) {
        Student student1 = new Student("M20201105");
        student1.setName("mowen");
        student1.setPhone("13800000000");

        Student student2 = new Student("M20201105");
        student2.setName("mowenqc");
        student2.setPhone("13800000008");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Map<Student, Student> studentMap = new HashMap<>();
        studentMap.put(student1,student1);
        studentMap.put(student2, student2);
        System.out.println(studentMap);

        System.out.println(student1.hashCode());
        System.out.println(student1.getName());
        student1.setName("mowen1");
        System.out.println(student1.hashCode());

    }
}
