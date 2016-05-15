package com.wolf.designpatterns.command;

/**
 * Created by wolf on 16/5/15.
 */
public class CommandClient {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        AddRequirementCommand addRequirementCommand = new AddRequirementCommand();

        invoker.setCommand(addRequirementCommand);

        invoker.actioin();
    }
}
