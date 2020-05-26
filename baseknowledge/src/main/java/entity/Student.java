package entity;

import lombok.Data;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/25 8:55
 * @description:
 *****/
@Data
public class Student {

    private String name;
    private String stuNo;
    private String age;

    public Student(){}
    public Student(String stuNo){
        this.stuNo = stuNo;
    }
}
