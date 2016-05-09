package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class YellowFemaleHuman  extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("黄种女性......");
    }
}
