package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public interface IHumanFactory {
    public IHuman createYellowHuman();
    public IHuman createWhiteHuman();
    public IHuman createBlackHuman();
}
