package com.wolf.designpatterns.builder;

/**
 * Created by wolf on 16/3/3.
 *
 * 主导类,控制着生产
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 调用各个部件生产
     */
    public void productConstruct(){
        builder.builderPart1();
        builder.builderPart2();
    }
}
