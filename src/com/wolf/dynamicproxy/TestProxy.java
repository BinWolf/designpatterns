package com.wolf.dynamicproxy;

import com.wolf.dynamicproxy.impl.WolfImpl;
import com.wolf.dynamicproxy.proxy.DynamicProxyHandler;

/**
 * Created by wolf on 15/12/15.
 */
public class TestProxy {
    public static void main(String[] args) {
        DynamicProxyHandler dp = new DynamicProxyHandler(new WolfImpl());
        IWolf iWolf= (IWolf) dp.dynamicProxy();
        iWolf.eat();
        iWolf.say();
    }
}
