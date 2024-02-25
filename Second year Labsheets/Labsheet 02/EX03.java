import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);
        System.out.println("please enter any number that you need");
        System.out.println("01.Area of Squre\n02.Area of Circle\n03.Area of Rectangle\n04.Area of Cylinder\n05.Exit");
   
   int choice=userinput.nextInt();
   switch(choice){
    case 1:
        System.out.println("you are selected to find the area of Squre");
        System.out.println("/n enter the length of Squre");
        float length=userinput.nextInt();
        float Squre=length*length;
        System.out.println("Area of Squre is="+Squre);
        break;

        case 2:
        System.out.print("\nplease enter the radius of cirle \n");
        float radius=userinput.nextFloat();
        float circle=(22/7)*radius*radius;
        System.out.print("Area os circle is ="+circle);
        break;
        
        
   case 3:
       System.out.print("\nplease enter the first sides of rectangle \n");
       float side1=userinput.nextFloat();
       System.out.print("\nplease enter the second sides of rectangle \n");
       float side2=userinput.nextFloat();
       float rectangular=side1*side2;
        System.out.print("Area os squre is ="+rectangular);
        break;
        
        
     
    case 4:
        System.out.print("\nplease enter the radius of cylinder \n");
       float radiuss=userinput.nextFloat();
       System.out.print("\nplease enter the height of cylinder \n");
       float height=userinput.nextFloat();
       float cylinder=2*(22/7)+radiuss*height;
       System.out.print("Area os cylinder is ="+cylinder);
       break;
       
       case 5:
           return;

        default:
        System.out.println("please enter 1-5");
   }
    }
}
