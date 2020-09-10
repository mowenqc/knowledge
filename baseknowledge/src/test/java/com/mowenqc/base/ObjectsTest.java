package com.mowenqc.base;

import java.util.Objects;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/28 16:39
 * @description:
 *****/
public class ObjectsTest {

    public void testObject(){
        Object object = new Object();
        Objects.isNull(object);
        Objects.nonNull(object);
        Objects.requireNonNull(object);
        Objects.requireNonNull(object, "对象不能为空");
    }
}
