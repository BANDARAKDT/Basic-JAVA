package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public float addNumbers(float x, float y) throws RemoteException;
    public float subNumbers(float x, float y) throws RemoteException;

}
