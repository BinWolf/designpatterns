package com.wolf.designpatterns.command;

/**
 * Created by wolf on 16/5/15.
 *
 * 定义一个与甲公司接头的人
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void actioin(){
        this.command.execute();
    }
}
