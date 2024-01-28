import java.util.Scanner;

public class Switch{
public static void main(String[] args) {
    System.out.println("enter any number from 1-7");
    Scanner obj=new Scanner(System.in);
    int day=obj.nextInt();

    switch(day){
        case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tueday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("satureday");
        break;
     
    }
}
}