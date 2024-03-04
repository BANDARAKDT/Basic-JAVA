import java.net.DatagramPacket;



public class DatagrameSock {

    public static void main(String[] args) {
        DatagrameSock scock=new DatagrameSock();
        byte[] buff=new byte[1024];
        DatagramPacket dataPack=new DatagramPacket(buff,1024);
        String str=new String(dataPack.getData());
        System.out.println(str);
        scock.close();


    }
}
