package com.wolf.designpatterns.abstractfactory;

/**
 * Created by wolf on 16/5/8.
 */
public abstract class AbstractHumanFactory implements IHumanFactory {

    protected IHuman createHuman(HumanEnum humanEnum) {
        IHuman human = null;
        if(!humanEnum.getValue().equals("")){
            try {
                human = (IHuman)Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
