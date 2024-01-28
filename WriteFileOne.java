import java.io.FileWriter;
import java.io.IOException;

public class WritefileOne {
    public static void main(String[] args) {
        String txt = "hello";

        try {

            FileWriter writer = new FileWriter("file.txt",true);
            writer.append(txt);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}