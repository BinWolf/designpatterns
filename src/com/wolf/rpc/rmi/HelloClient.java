package com.wolf.rpc.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by wolf on 16/7/18.
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            //获取远端的实例
            IHelloService iHelloService = (IHelloService) Naming.lookup("rmi://127.0.0.1:8899/iHello");
            System.out.println(iHelloService.helloWorld());
            System.out.println(iHelloService.sayHello2SomeBody("Wolf Bin"));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
