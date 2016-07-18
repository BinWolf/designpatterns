package com.wolf.rpc.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wolf on 16/7/18.
 */
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {

    public HelloServiceImpl() throws RemoteException{
    }

    @Override
    public String helloWorld() throws RemoteException {
        return "Hello world";
    }

    @Override
    public String sayHello2SomeBody(String name) throws RemoteException {
        return "Hello " + name;
    }
}
