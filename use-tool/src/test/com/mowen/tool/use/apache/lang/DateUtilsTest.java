package com.mowen.tool.use.apache.lang;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/6/2 13:07
 * @description:
 *****/
public class DateUtilsTest {


    @Test
    public void testAdd() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Date addDays = DateUtils.addDays(date, 1);
        System.out.println(addDays);

        Date addHours = DateUtils.addHours(date, 1);
        System.out.println(addHours);

        Date ceiling = DateUtils.ceiling(date, Calendar.HOUR);
        System.out.println(ceiling);

        Date ceiling1 = DateUtils.ceiling(date, Calendar.MINUTE);
        System.out.println(ceiling1);

        Date parseDate = DateUtils.parseDate("2020-10-20 14:59:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println(parseDate);

        Date round = DateUtils.round(date, Calendar.DAY_OF_MONTH);
        System.out.println(round);

        Date setDays = DateUtils.setDays(date, 1);
        System.out.println(setDays);

        Date truncate = DateUtils.truncate(date, Calendar.HOUR_OF_DAY);
        System.out.println(truncate);
    }
}
