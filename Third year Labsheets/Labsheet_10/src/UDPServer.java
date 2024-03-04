import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        final int PORT = 8888;

        try {
            DatagramSocket serverSocket = new DatagramSocket(PORT);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + message);

                // Broadcast message to all clients
                byte[] sendData = message.getBytes();
                for (SocketAddress clientAddress : serverSocket.getConnectedAddresses()) {
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress);
                    serverSocket.send(sendPacket);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
