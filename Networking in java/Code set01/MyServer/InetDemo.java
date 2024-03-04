import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress[] ips = InetAddress.getAllByName("www.tec.ruh.ac.lk");
            for (InetAddress ip : ips) {
                System.out.println("Host Address: " + ip.getHostAddress());
                System.out.println(" Is a local Address: " + ip.isAnyLocalAddress());
                System.out.println(" Is linked to a localaddress " + ip.isLinkLocalAddress());
                System.out.println(" loop back address" + ip.isLoopbackAddress());
                System.out.println(" multicast global scope " + ip.isMCGlobal());
                System.out.println(" reachable " + ip.isReachable(2000));
                System.out.println(" sute-local address " + ip.isSiteLocalAddress());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
