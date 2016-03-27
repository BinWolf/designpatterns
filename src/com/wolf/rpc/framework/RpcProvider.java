package com.wolf.rpc.framework;

import com.wolf.rpc.interf.HelloServiceImpl;
import com.wolf.rpc.interf.IHelloService;

/**
 * Created by wolf on 16/3/24.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        IHelloService helloService = new HelloServiceImpl();
        RpcFramework.export(helloService,4444);
    }
}
