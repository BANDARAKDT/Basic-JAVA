import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Subclass extends Superclass implements Serializable{
    int j;


    public Subclass(int i, int j){
        super(i);
        this.j=j;
    }
    
}

public class TetsClass{
public static void main(String[] args)throws IOException {
    Subclass subclass=new Subclass(10,20);

    System.out.println("i"+subclass.i);
    System.out.println("j "+subclass.j);

    try {
        FileOutputStream fileOut=new FileOutputStream("student.ser");
        ObjectOutputStream objOut=new ObjectOutputStream(fileOut);

        objOut.writeObject(subclass);

        System.out.println(" object serializedS");



    } catch (Exception e) {
        // TODO: handle exception
    }
}
}
