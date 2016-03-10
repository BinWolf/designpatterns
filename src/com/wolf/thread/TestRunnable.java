package com.wolf.thread;

/**
 * Created by wolf on 16/3/10.
 */
public class TestRunnable {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyRunnable mr = new MyRunnable();
        MyRunnable mr1 = new MyRunnable();
        new Thread(mr).start();
        new Thread(mr1).start();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}