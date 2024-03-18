package CalcService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {
private float sum;

    public MyCalculator() throws RemoteException {
    }

    @Override
    public float addNumbers(float x, float y) throws RemoteException {
        return x+y;
    }

    @Override
    public float subNumber(float x, float y) throws RemoteException {
        return x-y;
    }

    @Override
    public float multiply(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public float divide(int a, int b) throws RemoteException {
        return a/b;
    }
}
