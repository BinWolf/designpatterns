package com.wolf.reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by wolf on 15/12/17.
 */
public class TestRefle {

    @Test
    public void TestRef(){
        try {
            Class reflectionClass = Class.forName("com.wolf.reflection.ReflectionClass");
            //Object o = reflectionClass.newInstance();
            //Constructor[] constructorses = reflectionClass.getConstructors();
            /*for (Constructor c : constructorses) {
                System.out.println("name=" + c.getName());
                Class[] types = c.getParameterTypes();
                for (Class type : types) {
                    System.out.print(type +"  ");
                }
            }*/
            /*Constructor c =reflectionClass.getDeclaredConstructor(int.class);
            System.out.println(c);

            System.out.println();


            Method[] methods = reflectionClass.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }

            System.out.println();*/
            Method method = reflectionClass.getDeclaredMethod("printlnStr", String.class);
            method.setAccessible(true);
            //invoke 第一个参数是要调用的实例 ,第二个参数是该实例下的该方法的参数
            method.invoke(reflectionClass.newInstance(),"asdfsd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
