package Example01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Student{

public String name;
public String Address;
public int id;

public static void main(String[] args) throws IOException, ClassNotFoundException {
    Student student=new Student();

    student.name="dela";
    student.id=680;
    student.Address="ratnapura";

    //serialization
    try {
        FileOutputStream fileOut=new FileOutputStream("student.ser");
        ObjectOutputStream objOut=new ObjectOutputStream(fileOut);

        objOut.writeObject(student);

        objOut.close();
        fileOut.close();

        System.out.println("Student object serialised");
    } catch (Exception e) {
        // TODO: handle exception
    }

    //desirialization
    Student destudent;
    try {
        FileInputStream fileIn=new FileInputStream("student.ser");
        ObjectInputStream objIn=new ObjectInputStream(fileIn);
        destudent=(Student)objIn.readObject();
        objIn.close();
        fileIn.close();

        System.out.println("deserialized object");
        System.out.println("name: "+destudent.name);
        System.out.println("Address : "+destudent.Address);
    
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}


}