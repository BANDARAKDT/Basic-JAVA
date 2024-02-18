public class OOP3 {

    // please consider the OOP3 class as the Person class
    String name="Deshani";
    int age=24;

    public void PersonDetails(String name,int age){
        this.name=name;
        this.age=age;
    } 

    public void displayDetails(){
        System.out.println("person name:"+name+" and the age is:"+age);
    }
public static void main(String[] args) {
   OOP3 display=new OOP3();
   display.displayDetails();
}
   
    
}
