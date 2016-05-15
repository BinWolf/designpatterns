package com.wolf.designpatterns.bridge;

/**
 * Created by wolf on 16/5/15.
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨产品挣的钱.....");
    }
}
