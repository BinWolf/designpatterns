package com.wolf.thread;

/**
 * Created by wolf on 16/3/10.
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        TestThread tt1 = new TestThread();
        TestThread tt2 = new TestThread();
        tt1.start();
        tt2.start();
    }
}
