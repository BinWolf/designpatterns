package com.wolf.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wolf on 15/12/15.
 *
 * 本dome使用jdk的动态代理,需要有接口才能完成.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxies;

    public DynamicProxyHandler(Object proxies) {
        this.proxies = proxies;
    }

    public Object dynamicProxy() {

        /**
         * newProxyInstance 三个参数分别为:
         * ClassLoader loader 类加载器一般传代理类的默认加载器
         * Class<?>[] interfaces 代理接口,一般通过反射获取代理类实现的所有接口
         * InvocationHandler 代理实例的调用处理程序 实现的接口
         */
        return Proxy.newProxyInstance(proxies.getClass().getClassLoader(), proxies.getClass().getInterfaces(), DynamicProxyHandler.this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method" + method.getName());
        if(args != null)
            for(Object o : args)
                System.out.println("arg:   "+o);

        System.out.println("proxy start ....");
        Object obj = method.invoke(proxies, args);
        System.out.println("proxy end ....");

        return obj;
    }
}
