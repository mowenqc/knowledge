package com.mowenqc.base;

import org.junit.Test;

import java.util.UUID;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/28 15:33
 * @description:
 *****/
public class UUIDTest {

    @Test
    public void testUUID(){
        String id = UUID.randomUUID().toString();
        System.out.println(id);
        System.out.println(id.length());
        String id32 = id.replace("-","");
        System.out.println(id32);
        //数据库中的表的id不建议用，然后考虑以后的分布式情况，可以用redis生成id
        //上传文件可以用，比如要上产一张图片，保存两个字段 一个是原始文件的名称，一个就是id，这个id可以用UUID生成
    }
}
