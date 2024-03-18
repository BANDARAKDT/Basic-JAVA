import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("rmi://localhost:1888/MyFirst");
            obj.setName("John");
            System.out.println("Name retrieved from server: " + obj.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
