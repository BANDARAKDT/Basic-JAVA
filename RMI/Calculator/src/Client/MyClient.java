package Client;

import Calculator.Calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {

    public static void main(String[] args) {
        try {
            // Get the registry on port 3456
            Registry reg = LocateRegistry.getRegistry(3456);

            // Look up the calculator service
            Calculator cal = (Calculator) reg.lookup("calculatorService");

            // Perform addition and display result
            float sum = cal.addNumber(3, 9);
            System.out.println("Sum is " + sum);

            // Perform subtraction and display result
            float sub = cal.subNumber(8, 7);
            System.out.println("Subtraction is " + sub);

        } catch (Exception e) {
            System.out.println("Client not connected");
        }
    }
}
