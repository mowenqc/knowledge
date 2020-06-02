package com.mowen.tool.use.apache.lang;

import org.apache.commons.lang3.time.CalendarUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/6/2 11:06
 * @description:
 *****/
public class CalendarUtilTest {

    @Test
    public void testCalendarUtil(){
        int dayOfMonth = CalendarUtils.INSTANCE.getDayOfMonth();
        int month = CalendarUtils.INSTANCE.getMonth();
        int year = CalendarUtils.INSTANCE.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month + 1);//这儿月份减了1
        System.out.println(year);
    }

}
