package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("GivenGreenLight door go to doing....");
    }
}
