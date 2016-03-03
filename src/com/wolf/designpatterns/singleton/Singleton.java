package com.wolf.designpatterns.singleton;

/**
 * Created by wolf on 16/3/3.
 *
 * 双重检查加锁
 *
 * 使用“双重检查加锁”的方式来实现，就可以既实现线程安全，又能够使性能不受很大的影响。
 */
public class Singleton {

    /**
     * “双重检查加锁”机制的实现使用关键字volatile，被volatile修饰的变量的值，
     * 将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
     */
    private static volatile Singleton ourInstance = null;

    public static Singleton newInstance() {
        if(ourInstance == null ) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }

    private Singleton() {
    }
}
