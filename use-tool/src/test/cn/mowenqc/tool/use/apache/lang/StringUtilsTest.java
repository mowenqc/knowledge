package cn.mowenqc.tool.use.apache.lang;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 15:13
 * @description:
 *****/
public class StringUtilsTest {

    @Test
    public void testStringUtils(){
        String ss = " a b c d e f g h i j k l m n o p q r s t u v w x y z ";
        String reverse = StringUtils.reverse(ss);
        System.out.println(reverse);
        System.out.println(StringUtils.strip(ss));
        String substring = StringUtils.substring(ss, 3, 5);
        System.out.println(substring);
        String strip = StringUtils.strip(ss);
        System.out.println(strip);
    }
}
