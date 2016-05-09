package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    @Override
    public IHuman createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
