package com.mowenqc.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description: knowledge_parent
 * @author: huangkai
 * @createTime: 2020/8/25 15:56
 */
public class PropertiesLoadTEst {

    public void testProperties() throws IOException {
        InputStream resource = getClass().getClassLoader().getResourceAsStream("");
        Properties properties = new Properties();
        properties.load(resource);
        Properties properties1 = new Properties();
        if (properties1 != null) {

        }
        for (int i = 0; i < 10; i++) {

        }

    }
}
