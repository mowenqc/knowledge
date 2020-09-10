package cn.mowenqc.tool.use.apache.runtime;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemInfo {

    @Test
    public void testSystem(){
        Properties properties = System.getProperties();
        Map<String, String> environment = System.getenv();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        /*for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/
        for (Map.Entry<String, String> entry : environment.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
