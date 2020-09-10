package cn.mowenqc.tool.use.apache.lang;

import cn.mowenqc.tool.use.apache.domain.User;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import java.io.*;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 15:04
 * @description:
 *****/
public class SerializationUtilsTest {

    @Test
    public void testSerialization(){
        User user = new User();
        user.setAge(1);
        user.setName("mowen");
        System.out.println(user);
        User clone = SerializationUtils.clone(user);
        System.out.println(clone);
        System.out.println(user.equals(clone));
    }

    @Test
    public void testSerial() throws Exception {
        Object object = new Object();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        byte[] bytes = outputStream.toByteArray();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object object1 = objectInputStream.readObject();

    }
}
