package Labsheet_2.Singlaton Disign Pattern;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton(){
        public static JDBCSingleton getInstance(){
            if(jdbc==null){
                jdbc=new JDBCSingleton();
            }
            return jdbc;
        }


    }
} private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
        return con;
    }

    public int insert(String name, String pass, String id) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement("insert into employee(uid,uname,upassword)values(?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, pass);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

    public void view(String name) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = this.getConnection();
            ps = con.prepareStatement("select * from employee where uname=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Name= " + rs.getString(2) + "t" + "Paasword= " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public int update(String name, String password) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement(" update employee set upassword=? where uname='" + name + "' ");
            ps.setString(1, password);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

    public int delete(int userid) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement(" delete from employee where uid='" + userid + "' ");
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }
}
