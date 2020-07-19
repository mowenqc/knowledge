package cn.mowenqc.tool.use.apache.domain;

import lombok.Data;

import java.io.Serializable;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 10:39
 * @description:
 *****/
@Data
public class User implements Serializable {

    private int id;
    private String name;

    private int age;


}
