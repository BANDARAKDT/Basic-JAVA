package student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DetptStudentDataImpl extends UnicastRemoteObject implements  DeptStudentData {
    public DetptStudentDataImpl() throws RemoteException{
        super();
    }
    public ArrayList<Student> getAllStudents() throws RemoteException{
        ArrayList<Student> students = new ArrayList<>();
        try{
            Class.forName("com.mysql.jc.jdbc.Driver");

            String url = "jdbc:mysql//localhost:3306/student";
            String user = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url,user, password);

            Statement st = conn.createStatement();
            String query = "select * from basicdata";
            ResultSet result = st.executeQuery(query);

            while(result.next()){
                Student stu = new Student();
                stu.setUser_id(result.getString(1));
                stu.setUser_name(result.getString(2));
                stu.setUser_address(result.getString(3));

                students.add(stu);
            }

        }catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }
}
