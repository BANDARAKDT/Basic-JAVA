package calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {
    public MyCalculator() throws RemoteException{
        super();
    }
    public float addNumbers(float x, float y){
        return (x+y);
    }
    public float subNumbers(float x, float y){
        return (x-y);
    }
}