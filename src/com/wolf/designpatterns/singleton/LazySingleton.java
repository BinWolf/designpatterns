package com.wolf.designpatterns.singleton;

/**
 * Created by wolf on 16/3/3.
 *
 * 懒汉单列模式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    /**
     * synchronized 防止多线程在同一时间调用该方法导致多例.
     * @return
     */
    public static synchronized LazySingleton  newInstance() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
