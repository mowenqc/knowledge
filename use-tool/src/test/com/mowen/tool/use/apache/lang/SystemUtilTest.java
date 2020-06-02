package com.mowen.tool.use.apache.lang;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/6/2 15:18
 * @description:
 *****/
public class SystemUtilTest {

    @Test
    public void testSystem(){
        String hostName = SystemUtils.getHostName();
        System.out.println(hostName);

        String path = SystemUtils.getJavaHome().getPath();
        System.out.println(path);

        String userName = SystemUtils.getUserName();
        System.out.println(userName);

        String userPath = SystemUtils.getUserHome().getPath();
        System.out.println(userPath);

        String userDir = SystemUtils.getUserDir().getPath();
        System.out.println(userDir);
    }
}
