package student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface DeptStudentData extends Remote {
    public ArrayList<Student> getAllStudents() throws RemoteException;
}
