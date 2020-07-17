package com.mowenqc.ld;

import entity.Student;

import java.util.*;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/25 14:11
 * @description:
 *****/
public class LamdaMain {

    private List<Student> studentList;

    private void initData(){
        Student student1 = new Student("1");
        Student student2 = new Student("2");
        Student student3 = new Student("3");
        Student student4 = new Student("4");
        student1.setName("mowenqc");
        student2.setName("maozemin");
        student3.setName("liuyifei2");
        student4.setName("liuyifei2");
        studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

    public static void main(String[] args) {
        /*LamdaMain main = new LamdaMain();
        main.initData();
        List<Student> studentList = main.getStudentList();
        List<String> collect = studentList.stream().flatMap(student -> Arrays.stream(student.getName().split(""))).collect(Collectors.toList());
        System.out.println(collect);


        List<String> collect1 = studentList.stream().map(student -> student.getName().split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect1);

        long count = studentList.stream().filter(student -> student.getStuNo().equals("1")).count();
        System.out.println(count);

        List<String> list = studentList.stream().map(student -> student.getName().split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(list);

        Optional<Student> max = studentList.stream().max(Comparator.comparingInt(student -> student.getName().length()));
        Student student = max.get();
        System.out.println(student);

        String reduce = studentList.stream().map(student1 -> student1.getName()).reduce("", (a, b) -> a + b);
        System.out.println(reduce);

        Map<String, List<Student>> collect2 = studentList.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(collect2);
        studentList.stream().collect(Collectors.toMap(Student::getName, Function.identity(),(key1, key2)->key1));*/

        MyInterface myInterface = () -> {System.out.println("a");return 1;};
        myInterface.doSomeThing();

    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
