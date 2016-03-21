package com.wolf.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wolf on 16/3/21.
 *
 * 代理类
 *
 * 通过读取字节码反射代理
 */
public class CglibProxy implements MethodInterceptor {

    public Object createProxyObject(Class targetObject) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("before call method ....");
        Object result = methodProxy.invokeSuper(o, objects);
        //Object result1 = methodProxy.invoke(o, objects);
        System.out.println("after call method....");
        return result;
    }
}
