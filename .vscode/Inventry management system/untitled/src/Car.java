import java.io.*;

public class Car implements Serializable {
    public String make;
    public String model;
    public int year;
    public double price;


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car cr1=new Car();

        cr1.make="Srilanka";
        cr1.model="vega";
        cr1.price=2500.00;
        cr1.year=2024;

        FileOutputStream fOut=new FileOutputStream("Car.ser");
        ObjectOutputStream objOut=new ObjectOutputStream(fOut);
        objOut.writeObject(cr1);
        objOut.close();
        fOut.close();
        System.out.println("object serialized");

        FileInputStream fIn=new FileInputStream("Car.ser");
        ObjectInputStream ObjIn=new ObjectInputStream(fIn);

        Car cr2=(Car)ObjIn.readObject();
        ObjIn.close();
        fIn.close();


        System.out.println("object desirialized");
        System.out.println("the model "+cr2.model+" make by "+cr2.make+" price "+cr2.price);

    }
}
