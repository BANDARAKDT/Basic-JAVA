import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try{
            Hello obj = (Hello) Naming.lookup("rmi://localhost:1888/myFirst");
            //object Name in Registry
            System.out.println(obj.printHello());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
