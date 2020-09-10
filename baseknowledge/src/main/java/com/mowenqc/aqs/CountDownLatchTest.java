package com.mowenqc.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) { }
            System.out.println("执行完线程1");
            countDownLatch.countDown();

        }).start();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) { }
            System.out.println("执行完线程2");
            countDownLatch.countDown();
        }).start();
        System.out.println("执行主线程");
        countDownLatch.await();
        System.out.println("继续执行主线程");
        System.out.println("主线程执行完成");
    }
}
