package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 */
public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
