package Server;

import CalcService.Calculator;
import CalcService.MyCalculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
            Calculator calc=new MyCalculator();
            Registry reg= LocateRegistry.createRegistry(3456);
            reg.rebind("calculatorService",calc);
            System.out.println("server is Connected and running....!");
        }catch(Exception e){
            System.out.println("Server is not connected "+e.getMessage());
        }
    }
}
