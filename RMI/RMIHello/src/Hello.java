import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    void setName(String name) throws RemoteException;
    String getName() throws RemoteException;
}
