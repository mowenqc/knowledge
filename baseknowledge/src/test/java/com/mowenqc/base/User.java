package com.mowenqc.base;

import lombok.Data;

import java.io.Serializable;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/29 9:12
 * @description:
 *****/
@Data
public class User implements Serializable {

    private static final long serialUIDVersion = 1L;


    /**
     * 对象id
     */
    private int id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 登录的用户名
     */
    private String userName;

    /**
     * 用户电话号码
     */
    private String phone;

    /**
     * 用户登录密码
     */
    private String password;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
