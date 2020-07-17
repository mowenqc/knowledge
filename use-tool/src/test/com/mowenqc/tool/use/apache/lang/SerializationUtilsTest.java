package com.mowenqc.tool.use.apache.lang;

import com.mowenqc.tool.use.apache.domain.User;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

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
        User clone = SerializationUtils.clone(user);
        System.out.println(clone);
        System.out.println(user.equals(clone));
    }
}
