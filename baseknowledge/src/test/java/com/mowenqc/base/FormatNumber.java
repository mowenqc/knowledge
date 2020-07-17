package com.mowenqc.base;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FormatNumber {

    private double number = 123456.987654;

    private double dotNumber = .12;

    @Test
    public void testMethod1(){
        String formatNumber = String.format("%.2f", number);
        System.out.println(formatNumber);
    }

    @Test
    public void testMethod2(){
        DecimalFormat format = new DecimalFormat(".00");
        String formatNumber = format.format(number);
        System.out.println(formatNumber);
        String format1 = format.format(dotNumber);
        System.out.println(format1);
    }

    @Test
    public void testMethod3(){
        BigDecimal bigDecimal = new BigDecimal(dotNumber);
        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1.doubleValue());
    }
}
