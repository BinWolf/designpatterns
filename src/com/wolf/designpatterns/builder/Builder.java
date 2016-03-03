package com.wolf.designpatterns.builder;

/**
 * Created by wolf on 16/3/3.
 *
 * 抽象建造者 --> 建造器
 */
public interface Builder {

    void builderPart1();

    void builderPart2();

    Product retrieveResult();
}
