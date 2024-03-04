import java.io.*;
import java.net.Socket;

public class MyClient2 {

    public static void main(String[] args) throws IOException {

        try {
            Socket s = new Socket("localhost", 9090);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            String str1 = "", str2 = "";
            while (!str1.equals("404")) ;
            str1 = br.readLine();
            dout.writeUTF(str1);
            str2 = din.readUTF();
            System.out.println("server says: " + str2);
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
