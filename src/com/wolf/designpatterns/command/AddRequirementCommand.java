package com.wolf.designpatterns.command;

/**
 * Created by wolf on 16/5/15.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //页面也要添加
        pg.add();
        //代码也要添加
        cg.add();
        //给出计划
        super.rg.plan();
    }
}
