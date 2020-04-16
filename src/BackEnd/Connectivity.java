package BackEnd;

import java.sql.*;

public class Connectivity //create class Connectivity
{

    // JDBC driver name and database URL

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/sems?zeroDateTimeBehavior=convertToNull";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection conn;


    public static Connection mydb() throws Exception {
        if (conn == null) {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
       
            return conn;
        }
        return conn;     
         
    }
     
         
    public static void sud(String sql) throws Exception{
        Connection con = Connectivity.mydb();
        Statement st = con.createStatement();
        st.executeUpdate(sql);

    }
    
    public static ResultSet search(String sql) throws Exception{
        Connection con = Connectivity.mydb();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    
    

}
