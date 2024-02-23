public class EX02_b {
  
        public static void main(String[] args) {
            int rows = 4; 
            
            for (int i = 0; i < rows; i++) {
                // Inner loop for printing spaces
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }
                // Inner loop for printing #
                for (int k = 0; k <= i; k++) {
                    System.out.print("# ");
                }
                // Move to the next line after each row is printed
                System.out.println();
            }
        }
    }
    

