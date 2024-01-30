import java.util.Scanner;
public class JavaBasics2 {
    public static void main(String args[]){
        System.out.println("lets enter two numbers");

        Scanner inp=new Scanner(System.in);
        
        System.out.println("enter first number");
        int num1=inp.nextInt();

        System.out.println("enter second number");
        

        int num2=inp.nextInt();
        int total=num1+num2;
        System.out.println("Total of your numbers is..");
        System.out.println(total);
        
        
    }
}
