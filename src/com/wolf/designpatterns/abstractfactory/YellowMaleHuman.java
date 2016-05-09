package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("黄种男人.....");
    }
}
