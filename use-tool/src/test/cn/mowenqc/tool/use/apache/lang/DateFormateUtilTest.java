package cn.mowenqc.tool.use.apache.lang;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.util.Date;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 11:12
 * @description:
 *****/
public class DateFormateUtilTest {

    @Test
    public void testDateFormat(){
        Date date = new Date();
        String format = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(format);
    }
}
