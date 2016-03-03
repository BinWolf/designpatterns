package com.wolf.constant;

/**
 * Created by wolf on 15/12/20.
 */
public enum WeekValueEnum {

    MON(1,"星期一"),
    TUE(2,"星期二"),
    WED(3,"星期三"),
    THU(4,"星期四"),
    FRI(5,"星期五"),
    SAT(6,"星期六"),
    SUN(0,"星期天");

    private int value;
    private String desc;

    WeekValueEnum(int value,String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
