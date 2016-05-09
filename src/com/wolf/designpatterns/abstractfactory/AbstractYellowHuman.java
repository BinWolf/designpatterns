package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public abstract class AbstractYellowHuman implements IHuman{
    @Override
    public void laugh() {
        System.out.println("YellowHuman laugh ....");
    }
}
