package com.wolf.constant;

import org.junit.Test;

import java.util.EnumSet;

/**
 * Created by wolf on 15/12/20.
 */
public class EnumTest {

    @Test
    public void week_Test() {
        for (WeekEnum we : WeekEnum.values()) {
            System.out.println(we.toString());
        }

        System.out.println("=======================");
        WeekEnum flag = WeekEnum.TUE;
        switch (flag) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
        }

        System.out.println("---------------------------");

        //compareTo比较顺序
        switch (flag.compareTo(WeekEnum.MON)) {
            case -1:
                System.out.println("TUE 在 MON 之前");
                break;
            case 1:
                System.out.println("TUE 在 MON 之后");
                break;
            default:
                System.out.println("TUE 在 MON 一样");
                break;
        }

        System.out.println("---------------------------");

        System.out.println("className:  " + flag.getDeclaringClass().getName());
        System.out.println("enum name:  " + flag.name());
        System.out.println("改枚举在定义时的排序位置ordinal:  " + flag.ordinal());
    }

    @Test
    public void weekValue_Test() {
        System.out.println("Values: " + WeekValueEnum.SAT.getValue() + "  desc: " + WeekValueEnum.SAT.getDesc());

        System.out.println("---------------------------------------------");

        EnumSet<WeekValueEnum> es = EnumSet.allOf(WeekValueEnum.class);

        for (WeekValueEnum we : es) {
            System.out.println("{name:"+we.name()+", value:"+we.getValue()+", desc:"+we.getDesc()+"}");
        }
    }

}
