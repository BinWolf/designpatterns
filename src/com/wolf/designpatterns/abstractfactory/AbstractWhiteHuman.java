package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public abstract class AbstractWhiteHuman implements IHuman{
    @Override
    public void laugh() {
        System.out.println("AbstractWhiteHuman laugh ......");
    }
}
