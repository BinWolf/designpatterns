package com.wolf.rpc.original.framework;

import com.wolf.rpc.original.interf.HelloServiceImpl;
import com.wolf.rpc.original.interf.IHelloService;

/**
 * Created by wolf on 16/3/24.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        IHelloService helloService = new HelloServiceImpl();
        RpcFramework.export(helloService,4444);
    }
}
