package com.mowenqc.trytest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: knowledge_parent
 * @author: huangkai
 * @createTime: 2020/9/10 15:44
 */
public class TryFinallyTest {

    private static Lock lock = new ReentrantLock(true);
    public static void main(String[] args) {
        lock.lock();
        try {
            Thread.sleep(100);
            System.out.println("模拟一个100毫秒的执行");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("执行了unLock");
        }
    }
}
