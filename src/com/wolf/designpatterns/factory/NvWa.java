package com.wolf.designpatterns.factory;

import java.io.IOException;

/**
 * Created by wolf on 16/5/8.
 */
public class NvWa {

    public static void main(String[] args) throws IOException {
        System.out.println("------------白人----------------");
        IHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();

        System.out.println("------------生产第2批:黑人----------------");
        IHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();

        System.out.println("------------生产第2批:黑人----------------");
        IHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();

        //随机生产,管他是哪种人,只要是人就行

        for (int i = 0; i < 10; i++) {
            System.out.println("随机生产人种开始===================");
            IHuman human = HumanFactory.createHuman();
            human.laugh();
        }
    }
}
