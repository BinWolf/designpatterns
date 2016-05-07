package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("BlockEnemy go to doing ....");
    }
}
