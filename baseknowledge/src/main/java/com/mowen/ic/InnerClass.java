package com.mowen.ic;

import lombok.Data;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/25 13:48
 * @description:
 *****/
public class InnerClass {

    public void initData(){
        UserVO userVO = new UserVO();
        userVO.name = "mowen";
        userVO.phone = "13800000008";
        System.out.println(userVO);
    }

    public static void main(String[] args) {
        Integer integer = Integer.valueOf("000");
        System.out.println(integer);
    }






    @Data
    class UserVO{

        private String phone;

        private String name;

    }
}
