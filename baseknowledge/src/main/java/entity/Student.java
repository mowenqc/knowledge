package entity;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NonNull;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/25 8:55
 * @description:
 *****/
@Data
public class Student {


    private String stuNo;

    private String name;

    private String phone;

    public Student() {
    }

    public Student(String stuNo){
        this.stuNo = stuNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            return stuNo.equals(((Student) obj).getStuNo());
        }
        return false;
    }

    /*@Override
    public int hashCode() {
        return stuNo.hashCode();
    }*/
}
