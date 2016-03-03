package com.wolf.reflection;

/**
 * Created by wolf on 15/12/17.
 */
public class ReflectionClass {
    private int count;

    public ReflectionClass() {
    }
    public ReflectionClass(int count) {
        this.count = count;
    }

    public void increase(int step) {
        count = count + step;
    }

    private void printlnStr(String s) {
        System.out.println(s);
    }
}
