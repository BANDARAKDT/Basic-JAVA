import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name= obj.nextLine();
        System.out.println("you entered "+name);
    }
}
