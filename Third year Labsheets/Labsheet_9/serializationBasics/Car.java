
package serializationBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable{

public String make;
public String model;
public int year;
public double price;

public static void main(String[] args) {
    Car cr=new Car();
    cr.make="BMW";
    cr.model="model1";
    cr.price=1000.00;
    cr.year=2024;


   

try {
   
    FileOutputStream fileOut=new FileOutputStream("car.ser");
    ObjectOutputStream objOut=new ObjectOutputStream(fileOut);
    objOut.writeObject(fileOut);

    objOut.close();
    fileOut.close();
} catch (Exception e) {
   System.out.println("IoException is cought");
}
System.out.println("File decentralized");

Car cr2=null;


try {
    //read the object form the file
    FileInputStream fileIn=new FileInputStream("car.ser");
    ObjectInputStream objIn=new ObjectInputStream(fileIn);

    //method to decentralized of object
    cr2=(Car)objIn.readObject();
    objIn.close();
    fileIn.close();
} catch (Exception e) {
   System.out.println("IOException is caught");

}
System.out.println("file decrentralized\n here are the values of the file");
System.out.println("model of the "+cr.make+" is "+cr.model+"and it is "+cr.price+"in "+cr.year);

}
}