import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
           Hello skel = new HelloRemote();
           Registry rgsty = LocateRegistry.createRegistry(1888);
           rgsty.rebind("myFirst", skel);
          //Naming.rebind("rmi://localhost:9856/myFirst",skel);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
