import java.net.*;

public class ReverseDNSLookup {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("216.58.194.196");
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println("Host Name: " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
