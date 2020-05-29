package com.mowen.base;

import org.junit.Test;

import java.io.*;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/29 9:11
 * @description:
 *****/
public class DeepCopyTest {


    /**
     * 深度拷贝
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public  void testDeepCopy() throws IOException, ClassNotFoundException {
        User user = new User(1,"mowen");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(user);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        User copyUser = (User) objectInputStream.readObject();
        System.out.println(user);
        System.out.println(copyUser);
        //记得流操作完成之后一定要关闭
        byteArrayOutputStream.close();
        outputStream.close();
        byteArrayInputStream.close();
        objectInputStream.close();
    }
}
