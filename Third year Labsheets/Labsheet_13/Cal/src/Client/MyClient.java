package Client;

import CalcService.Calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {


    public static void main(String[] args) {
        try{
            Registry reg= LocateRegistry.getRegistry("localhost",3456);
            Calculator calc=(Calculator) reg.lookup("calculatorService");

            float sum=calc.addNumbers(3,9);
            System.out.println("Sum is:"+sum);

            float sub=calc.subNumber(4,5);
            System.out.println("Substraction is "+sub);

            float mul=calc.multiply(5,10);
            System.out.println("Multiplication is "+mul);

            float div=calc.divide(10,8);
            System.out.println("Division is "+div);


        }catch (Exception e){

            System.out.println("Client not connected.."+e.getMessage());
        }
    }
}
