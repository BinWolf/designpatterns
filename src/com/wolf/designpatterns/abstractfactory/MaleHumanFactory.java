package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class MaleHumanFactory extends AbstractHumanFactory{
    @Override
    public IHuman createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public IHuman createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
