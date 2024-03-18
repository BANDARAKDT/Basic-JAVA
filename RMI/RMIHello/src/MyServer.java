import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            Hello skel = new HelloRemote();
            Registry registry = LocateRegistry.createRegistry(1888);
            registry.rebind("MyFirst", skel);
            System.out.println("Server is running...");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
