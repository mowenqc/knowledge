package cn.mowenqc.tool.use.apache.lang;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 14:59
 * @description:
 *****/
public class RandomUtilsTest {

    @Test
    public void testRandom(){
        for (int i = 0; i < 15; i++){
            int anInt = RandomUtils.nextInt(1, 20);
            System.out.println(anInt);
        }
    }
}
