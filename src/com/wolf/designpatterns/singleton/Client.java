package com.wolf.designpatterns.singleton;
/**
 * Created by wolf on 16/3/3.
 *
 * 测试单例模式
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.newInstance();
            System.out.println(singleton.toString());
        }
    }

}
