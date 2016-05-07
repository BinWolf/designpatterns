package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("First door , wolf go to doing ......");
    }
}
