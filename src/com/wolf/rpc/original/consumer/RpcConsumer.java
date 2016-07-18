package com.wolf.rpc.original.consumer;

import com.wolf.rpc.original.framework.RpcFramework;
import com.wolf.rpc.original.interf.IHelloService;

/**
 * Created by wolf on 16/3/24.
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        IHelloService helloService = RpcFramework.refer(IHelloService.class, "127.0.0.1", 4444);
        for (int i = 0; i < 10; i++) {
            String hello = helloService.sayHello(" World " + i);
            System.out.println(hello);
            Thread.sleep(2000);

        }
    }
}
