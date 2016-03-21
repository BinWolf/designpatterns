package com.wolf.dynamicproxy.impl;

import com.wolf.dynamicproxy.IWolf;

/**
 * Created by wolf on 15/12/15.
 *
 * 原始实现类
 */
public class WolfImpl implements IWolf {

    @Override
    public void say() {
        System.out.println("wolf say ....");
    }

    @Override
    public void eat() {
        System.out.println("wolf eat ...");
    }
}
