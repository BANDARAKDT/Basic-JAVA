package CalcService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public float addNumbers(float x,float y)throws RemoteException;

    public float subNumber(float x,float y)throws RemoteException;

    public float multiply(int a, int b) throws java.rmi.RemoteException;

    public float divide(int a, int b) throws java.rmi.RemoteException;

}
