package com.wolf.rpc.original.interf;

/**
 * Created by wolf on 16/3/24.
 */
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }

}
