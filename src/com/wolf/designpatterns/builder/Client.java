package com.wolf.designpatterns.builder;

/**
 * Created by wolf on 16/3/3.
 */
public class Client {

    public static void main(String[] args) {

        //建造东东
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.productConstruct();

        //获取东东
        Product product= builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
        System.out.println(product);
    }
}
