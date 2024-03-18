package com.mid.inheritance;


import java.io.*;

class SuperClass{
    public int i;
    public SuperClass(int i){
        i=50;
        System.out.println("super class constructor running");

    }
        }
class Subclass1 extends SuperClass implements Serializable {
    int j;
    public Subclass1(int i,int j) {
        super(i);
        this.j=j;



    }
}

public class Subclass{
    public Subclass(int i, int j) {
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Subclass sub=new Subclass(10,20);

        FileOutputStream fOut=new FileOutputStream("inheritance.ser");
        ObjectOutput objOut=new ObjectOutputStream(fOut);
        objOut.close();

    }
}
