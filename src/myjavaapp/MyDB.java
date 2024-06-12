
package myjavaapp;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.PreparedStatement;

public class MyDB {
        
    private Connection c;
    private static MyDB dbc;
    
    //  PreparedStatement ps;
     // ResultSetMetaData rsm;
    
 
        
        public static Connection dbConnect()
        {
                try{
                        Class.forName("com.mysql.jdbc.Driver");
                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyQuizDB","root","");
                       // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/MyQuizDB","root","");
                }
                catch(Exception e){
                        System.out.println("e");
                        return null;
                }
            return null;
        }
        public static MyDB getmydb()
        {
                if(dbc==null){
                        dbc=new MyDB();
                }
                return dbc;
        }
        public Connection getConnection()
        {
                return c;
        }
        public static void main(String[] args) {
            new MyDB();
    }
}
