package com.mid.inheritance;


import java.io.*;

class Kid implements Serializable{
    public String stuName;

    Kid(String stuName){
        this.stuName=stuName;
    }
}


public class Student extends Kid{
    public String stuAddress;
    public int stuId;

    public Student(String stuAddress,String stuName,int stuId){
        super(stuName);
        this.stuAddress=stuAddress;
        this.stuName=stuName;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu=new Student("Matara","dela",25);


        FileOutputStream fOut=new FileOutputStream("Stu.ser");
        ObjectOutput objOut=new ObjectOutputStream(fOut);
        objOut.writeObject(stu);
        objOut.close();
        fOut.close();
    }


}