package com.wolf.designpatterns.singleton;

/**
 * Created by wolf on 16/3/3.
 *
 * 恶汉单列模式
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 重写默认构造方法为private,阻止被new创造实例
     */
    private EagerSingleton(){}

    public static EagerSingleton newInstence() {
        return eagerSingleton;
    }

}
