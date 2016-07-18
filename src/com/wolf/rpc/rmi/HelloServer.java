package com.wolf.rpc.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by wolf on 16/7/18.
 */
public class HelloServer {
    public static void main(String[] args) {
        try {
            //实例化接口
            IHelloService iHelloService = new HelloServiceImpl();
            //绑定端口
            LocateRegistry.createRegistry(8899);
            //暴露接口,并指定访问路径
            Naming.bind("rmi://127.0.0.1:8899/iHello",iHelloService);

            System.out.println("HelloServer start ........");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
