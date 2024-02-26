package Example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

    public static void main(String[] args) {
        Demo demo=new Demo(100,"Dela");
        

        //serialization
try {
    FileOutputStream fileOut= new FileOutputStream("Demo.ser");
    ObjectOutputStream objOut=new ObjectOutputStream(fileOut);
objOut.writeObject(objOut);

objOut.close();
fileOut.close();
System.out.println("Object of Demo class has been serialized");


} catch (Exception e) {
    // TODO: handle exception
}

Demo demoo=null;

try {
    FileInputStream fileIn=new FileInputStream("Demo.ser");
    ObjectInputStream objIn=new ObjectInputStream(fileIn);
    

    demoo=(Demo)objIn.readObject();
    objIn.close();
    fileIn.close();

    System.out.println("Object has been deserialized");

    System.out.println("a= "+demoo.a);
    System.out.println("b= "+demo.b);
} catch (Exception e) {
    // TODO: handle exception
}

    }
}
