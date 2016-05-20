package com.wolf.designpatterns.decorator;

/**
 * Created by wolf on 16/5/15.
 *
 * 装饰类
 */
public abstract class Decorator implements SchoolReport {
    //首先我要知道是那个成绩单
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
