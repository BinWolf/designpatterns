package com.wolf.designpatterns.strategy;

/**
 * Created by wolf on 16/5/7.
 *
 * 策略模式高内聚低耦合
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
