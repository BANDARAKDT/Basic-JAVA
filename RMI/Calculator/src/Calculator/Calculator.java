package Calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    float addNumber(int x, int y) throws RemoteException;

    float subNumber(int x, int y) throws RemoteException;
}
