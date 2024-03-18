import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemote extends UnicastRemoteObject implements Hello {
    private String name;

    public HelloRemote() throws RemoteException {
        super();
    }

    public void setName(String name) throws RemoteException {
        this.name = name;
    }

    public String getName() throws RemoteException {
        return name; // Return the stored name
    }
}
