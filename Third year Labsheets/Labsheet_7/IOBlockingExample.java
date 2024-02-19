import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  IOBlockingExample{
    public static void main(String[] args) {
        Thread ioThread=new Thread();

        ioThread.start();
    }
}

class IOThread implements Runnable{

    @Override
    public void run() {
       
    try {
        BufferedReader reader=new BufferedReader(new InputStreamReader((System.in)));
       String input;
        input = reader.readLine();
        System.out.println("user input: "+input);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

       
    }


}