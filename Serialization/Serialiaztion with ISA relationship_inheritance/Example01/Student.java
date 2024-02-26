import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Student extends Kid {
    public String address;
    public int id;

    public Student(String name,String address, int id){
        super(name);
        this.address=address;
        this.id=id;


    }
    public static void main(String[] args) {
        Student student=new Student("dela", "Ratnapura", 100);


        //serialization

        try {
            FileOutputStream fileOut=new FileOutputStream("Student.ser");
            ObjectOutputStream objOut=new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            objOut.close();
            fileOut.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
