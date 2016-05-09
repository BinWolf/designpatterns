package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线,男性生产线
        IHumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线,女性生产线
        IHumanFactory femaleHumanFactory = new FemaleHumanFactory();


        //生产线建立完毕,开始生产人了:
        IHuman maleYellowHuman = maleHumanFactory.createYellowHuman();
        IHuman femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.laugh();
        maleYellowHuman.sex();
        femaleYellowHuman.laugh();
        femaleYellowHuman.sex();

    }
}
