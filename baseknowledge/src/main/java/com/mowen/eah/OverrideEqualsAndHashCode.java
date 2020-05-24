package com.mowen.eah;

import lombok.Data;

public class OverrideEqualsAndHashCode {

    public static void main(String[] args) {
        Student student1 = new Student();

        Student student2 = new Student();


    }



    @Data
    public static
    class Student{

        private String stuNo;

        private String name;

        private String phone;

        public Student() {
        }

        public Student(String stuNo){
            this.stuNo = stuNo;
        }
    }
}
