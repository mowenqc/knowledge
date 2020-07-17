package com.mowenqc.base;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    @Test
    public void testTimeFormat(){
        /**
         * 注意一点非常重要的就是：SimpleDateFormat是线程不安全的，不要定义为全局变量，我们在需要的地方，每次都new一个。
         */
        SimpleDateFormat sdf = new SimpleDateFormat("MM-HH");
        String format = sdf.format(new Date());
        System.out.println(format);
    }
}
