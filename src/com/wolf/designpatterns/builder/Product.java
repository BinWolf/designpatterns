package com.wolf.designpatterns.builder;

/**
 * Created by wolf on 16/3/3.
 *
 * 建造模式 --> 产品
 */
public class Product {

    //部件1
    private String part1;
    //部件2
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }
}
