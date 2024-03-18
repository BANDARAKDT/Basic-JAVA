package Calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {

    public MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public float addNumber(int x, int y) throws RemoteException {
        return x + y;
    }

    @Override
    public float subNumber(int x, int y) throws RemoteException {
        return x - y;
    }
}
