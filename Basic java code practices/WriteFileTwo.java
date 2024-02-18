import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileTwo {

    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("file2.txt"));
            writer.write("hello");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
