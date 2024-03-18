package Client;

import calculator.Calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MyClient {
    public static void main(String[] args) {
        try{
            //Get the registry
            Registry reg = LocateRegistry.getRegistry("localhost",3456);

            //lookup for the remote object
            Calculator calc = (Calculator) reg.lookup("calculatorService");

            //Invoke methods using remote objects
            float sum = calc.addNumbers(3,9);
            System.out.println("Sum is: "+sum);

            float sub = calc.subNumbers(23,9);
            System.out.println("Subtracted value is: "+sub);
        }catch (Exception e){
            System.out.println("Client not connected..... "+e.getMessage());
        }
    }
}
