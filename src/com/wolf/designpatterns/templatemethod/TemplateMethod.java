package com.wolf.designpatterns.templatemethod;

/**
 * Created by wolf on 16/5/15.
 *
 */
public class TemplateMethod {

    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarm(true);
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();

    }

}
