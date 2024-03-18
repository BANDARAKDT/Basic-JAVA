package server;

import student.DeptStudentData;
import student.DetptStudentDataImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
            DeptStudentData stub = new DetptStudentDataImpl();

            Registry reg = LocateRegistry.createRegistry(4444);

            reg.rebind("studentDataService",stub);

            System.out.println("Server is connected and running....");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
