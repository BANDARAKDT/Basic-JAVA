package com.mid.inheritance;


import java.io.*;

public class StaticDemo implements Serializable {
    static int x = 50;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StaticDemo demo = new StaticDemo();
        System.out.println("Value of x before serialization: "+x);

        FileOutputStream fileOut = new FileOutputStream("staticDemo.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(demo);

        objOut.close();

        fileOut.close();
        System.out.println("Object Serialized");
        x=40;
        FileInputStream fileIn = new FileInputStream("staticDemo.ser");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        StaticDemo newDemo = (StaticDemo) objIn.readObject();
        objIn.close();
        fileIn.close();
        System.out.println("value of x after serialization: "+newDemo.x);
    }
}
