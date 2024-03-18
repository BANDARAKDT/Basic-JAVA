package server;

import calculator.Calculator;
import calculator.MyCalculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
            //create remote object
            Calculator calc = new MyCalculator();

            //create a remote registry
            Registry reg = LocateRegistry.createRegistry(3456);

            //register the remote object to the registry and advertise
            reg.rebind("calculatorService",calc);

            System.out.println("Server is connected and running.....");
        }catch (Exception e){
            System.out.println("Server is not connected..... "+e.getMessage());
        }
    }
}
