import java.util.Scanner;

public class EX02 {

//         * 
//       *  * 
//     *  *  * 
//   *  *  *  * 
// *  *  *  *  *
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=scanner.nextInt();
        scanner.close();

        for (int i = 0; i < rows; i++) {
            // Print leading space
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}
