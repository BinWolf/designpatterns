package com.wolf.designpatterns.factory;

import java.util.List;
import java.util.Random;

/**
 * Created by wolf on 16/5/8.
 */
public class HumanFactory {

    /**
     *
     * @param z
     * @return
     */
    public static IHuman createHuman(Class z) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(z.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }

    public static IHuman createHuman() {
        IHuman human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(IHuman.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}
