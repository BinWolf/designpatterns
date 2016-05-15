package com.wolf.designpatterns.command;

/**
 * Created by wolf on 16/5/15.
 * Command pattern 命令模式
 * 定义一个命令接口,部门的所有组都要执行这些命令
 */
public interface Group {

    /**
     * 甲乙双方分开办公,你要和那个组讨论,你首先要找到这个组
     */
    public void find();

    /**
     * 被要求增加功能
     */
    public void add();

    /**
     * 被要求删除功能
     */
    public void delete();

    /**
     * 被要求修改功能
     */
    public void change();

    /**
     * 被要求给出所有的变更计划
     */
    public abstract void plan();

}
