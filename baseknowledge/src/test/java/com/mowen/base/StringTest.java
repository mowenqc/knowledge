package com.mowen.base;

import org.junit.Test;

public class StringTest {


    @Test
    public void testStringBuilderAndStringBuffer(){
        StringBuilder builder = new StringBuilder("helloworld");
        StringBuffer buffer = new StringBuffer("helloworld");
        System.out.println(builder);
        System.out.println(buffer);
        builder.append("_1");
        buffer.append("_1");
        System.out.println(builder);
        System.out.println(buffer);


    }
}
