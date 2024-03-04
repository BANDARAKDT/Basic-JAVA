import java.net.*;

public class InetAddressMethods {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Host Address: " + address.getHostAddress());
            System.out.println("Host Name: " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
