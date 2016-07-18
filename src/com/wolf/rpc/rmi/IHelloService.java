package com.wolf.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wolf on 16/7/18.
 *
 * @desc 暴露的接口
 */
public interface IHelloService extends Remote {

    String helloWorld() throws RemoteException;

    String sayHello2SomeBody(String name) throws RemoteException;
}
