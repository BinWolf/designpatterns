package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("黑人女人...");
    }
}
