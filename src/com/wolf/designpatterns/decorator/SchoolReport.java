package com.wolf.designpatterns.decorator;

/**
 * Created by wolf on 16/5/15
 */
public interface SchoolReport {

    //成绩单的主要展示的就是你的成绩情况
    public void report();

    //成绩单要家长签字,这个是最要命的
    public void sign(String name);
}
