public class OOP4 extends OOP3{
//please assume that the OOP3 class as the student
int studentID=125;


public void studentDetails(String name,int age,int studentID){
    super.PersonDetails("Deshani", 24);
    this.studentID=studentID;
    
}
public void displayDetails(){
    super.displayDetails();
    System.out.println("Student id is: "+studentID);
}

public static void main(String[] args) {
    OOP4 display=new OOP4();
    display.displayDetails();
}
    
}
 