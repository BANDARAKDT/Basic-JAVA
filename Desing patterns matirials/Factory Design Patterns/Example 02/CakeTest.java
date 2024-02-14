import java.util.Scanner;

public class CakeTest {
    public static void main(String args[]) { 
        Cake cake = null; 
        System.out.println("Which Cake you would like to eat "); 
        Scanner scanner = new Scanner(System.in); 
        String choice = scanner.nextLine(); 
        scanner.close(); 
        if (choice.equals("BlackForest")) { 
         cake = new BlackForest(); 
        }  
        else if (choice.equals("BlueBerry")) { 
         cake = new BlueBerry(); 
         }  
  else if (choice.equals("LitchiGateaux")) { 
   cake = new LitchiGateaux(); 
  }  
  
  cake.aboutCake(); 
 }
      
}
