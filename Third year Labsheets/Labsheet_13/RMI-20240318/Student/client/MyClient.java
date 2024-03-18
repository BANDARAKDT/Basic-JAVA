package client;

import student.DeptStudentData;
import student.Student;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class MyClient {
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",4444);
            DeptStudentData stub = (DeptStudentData) reg.lookup("studentDataService");

            ArrayList<Student> students = stub.getAllStudents();

            for (Student stu:students){
                System.out.println("ID: "+stu.getUser_id());
                System.out.println("Name: "+stu.getUser_name());
                System.out.println("Address: "+stu.getUser_address());
                System.out.println("");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
