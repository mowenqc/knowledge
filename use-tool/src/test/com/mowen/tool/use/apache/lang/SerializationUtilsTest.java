package com.mowen.tool.use.apache.lang;

import com.mowen.tool.use.apache.domain.User;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: huangkai
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
