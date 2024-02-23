public class EX01_a{

// * 
// * * 
// * * * 
// * * * * 

public static void main(String[] args) {
    int rows = 4; // Number of rows in the pattern

    // Outer loop for the number of rows
    for (int i = 0; i < rows; i++) {
        // Inner loop for printing * in each row
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        // Move to the next line after each row is printed
        System.out.println();
    }
}


}