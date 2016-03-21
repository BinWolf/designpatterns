package com.wolf.cglib;

/**
 * Created by wolf on 16/3/21.
 */
public class CglibMain {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Hello hello = (Hello) proxy.createProxyObject(Hello.class);
        hello.sayHello();
    }
}
