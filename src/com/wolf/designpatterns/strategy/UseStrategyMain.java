package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 */
public class UseStrategyMain {
    public static void main(String[] args) {
        StrategyContext strategyContext;
        System.out.println("use backdoor ........");
        strategyContext = new StrategyContext(new BackDoor());
        strategyContext.operate();

        System.out.println();

        System.out.println("use givengreenlight ...");
        strategyContext = new StrategyContext(new GivenGreenLight());
        strategyContext.operate();

        System.out.println();
        System.out.println("use Blockenmy .....");
        strategyContext = new StrategyContext(new BlockEnemy());
        strategyContext.operate();

    }
}
