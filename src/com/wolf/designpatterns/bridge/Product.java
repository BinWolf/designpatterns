package com.wolf.designpatterns.bridge;

/**
 * Created by wolf on 16/5/15.
 */
public abstract class Product {

    /**
     * 甭管是什么产品它总要是能被生产出来
     */
    public abstract void beProducted();

    /**
     * 生产出来的东西,一定要销售出去,否则扩本呀
     */
    public abstract void beSelled();


}
