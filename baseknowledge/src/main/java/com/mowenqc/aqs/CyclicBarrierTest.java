package com.mowenqc.aqs;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("开始执行3个任务"));
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    cyclicBarrier.await();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("执行完成i=" + finalI);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}
