package com.wolf.designpatterns.builder;

/**
 * Created by wolf on 16/3/3.
 *
 * 建造模式是对象的创建模式。建造模式可以将一个产品的内部表象（internal representation）
 * 与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    /**
     * 生成部件1
     */
    @Override
    public void builderPart1() {
        product.setPart1("部件1");
    }

    /**
     * 生成部件2
     */
    @Override
    public void builderPart2() {
        product.setPart2("部件2");
    }

    /**
     * 返回整个产品
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }

}
