import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
    private String street;
    private String city;
    private String country;


    public Address(String street, String city, String country){
        this.city=city;
        this.country=country;
        this.street=street;


    }
}



class Person implements Serializable{

private String name;
private int age;
private Address address;

public Person(String name,int age,Address address){
    this.name=name;
    this.age=age;
    this.address=address;


}

public Person(String name2, int age2, String string) {
    //TODO Auto-generated constructor stub
}


}

public class Aggregation{
    public static void main(String[] args) {
        

        Address address=new Address("main street", "Ratnapur", "Srilanka");

        Person person=new Person("Dela", 25,address);

       try {
        FileOutputStream fileOut=new FileOutputStream("person.ser");
        ObjectOutputStream objOut=new ObjectOutputStream(fileOut);

        objOut.writeObject(person);

        objOut.close();
        fileOut.close();
        
       } catch (Exception e) {
        // TODO: handle exception
       }
        System.out.println("object serialized");
    }
}