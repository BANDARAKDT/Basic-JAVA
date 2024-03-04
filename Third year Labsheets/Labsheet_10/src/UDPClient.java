import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        final String SERVER_IP = "localhost";
        final int PORT = 8888;

        try {
            DatagramSocket clientSocket = new DatagramSocket();

            while (true) {
                byte[] sendData;
                String message = "Hello from client!";
                sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(SERVER_IP), PORT);
                clientSocket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);

                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + receivedMessage);

                Thread.sleep(1000); // Add delay for demonstration
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
