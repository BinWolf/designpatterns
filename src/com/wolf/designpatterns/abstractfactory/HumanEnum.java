package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public enum HumanEnum {
    YelloMaleHuman("com.wolf.designpatterns.abstractfactory.YellowMaleHuman"),
    YelloFemaleHuman("com.wolf.designpatterns.abstractfactory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.wolf.designpatterns.abstractfactory.WhiteFemaleHuman"),
    WhiteMaleHuman("com.wolf.designpatterns.abstractfactory.WhiteMaleHuman"),
    BlackFemaleHuman("com.wolf.designpatterns.abstractfactory.BlackFemaleHuman"),
    BlackMaleHuman("com.wolf.designpatterns.abstractfactory.BlackMaleHuman");
    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
