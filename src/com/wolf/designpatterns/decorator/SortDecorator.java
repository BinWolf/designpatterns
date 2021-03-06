package com.wolf.designpatterns.decorator;

/**
 * Created by wolf on 16/5/15.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}
