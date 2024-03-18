import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemote extends UnicastRemoteObject implements Hello {
    public HelloRemote() throws RemoteException{

    }

    public String printHello(){
        return "Hello World";
    }

    public static void main(String[] args) {
        try{
            HelloRemote obj = new HelloRemote();
            //bind this object instance to the name "HelloServer"
            Naming.rebind("HelloServer",obj);
        }catch (Exception e){
            System.out.println("HelloImp error: "+e.getMessage());
        }
    }
}
