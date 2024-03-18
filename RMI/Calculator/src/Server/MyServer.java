package Server;

import Calculator.Calculator;
import Calculator.MyCalculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the Calculator
            Calculator cal = new MyCalculator();

            // Create and start the RMI registry on port 3456
            Registry regt = LocateRegistry.createRegistry(3456);

            // Bind the calculator service to the registry
            regt.rebind("calculatorService", cal);

            System.out.println("Calculator service is running...");
        } catch (Exception e) {
            System.out.println("Server is not connected: " + e);
        }
    }
}
