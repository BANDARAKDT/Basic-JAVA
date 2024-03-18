import java.io.*;

public class Student implements Serializable {

    public String stuName;
    public String stuAddress;
    public int stuId;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student();
        student.stuId=001;
        student.stuName="dela";
        student.stuAddress="matara";


        FileOutputStream fout=new FileOutputStream("student.ser");
        ObjectOutputStream objOut=new ObjectOutputStream(fout);

        objOut.writeObject(student);
        objOut.close();
        fout.close();

        System.out.println("serialized");

        FileInputStream fIn=new FileInputStream("student.ser");
        ObjectInputStream objIn=new ObjectInputStream(fIn);

        Student deStudent=(Student)objIn.readObject();
        objIn.close();
        fIn.close();

        System.out.println("deserialized the student");
        System.out.println("Name "+deStudent.stuName);
        System.out.println("Address "+deStudent.stuAddress);
    }
}
