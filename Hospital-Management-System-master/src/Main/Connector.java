package Main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class Connector {

   private static Connection conn = null;
   PreparedStatement pst = null;
   ResultSet rst = null; 
    
    public static void main(String[] args) {
        ConnectDb();
    }

    public static Connection ConnectDb() {
      //  Connection connection = null;
        try {

        String dataSourceName = "/DataBase/DBMentalHospital.accdb";
        String dir = System.getProperty("user.dir");
        String url = "jdbc:ucanaccess://" + dir + "/" + dataSourceName;
        Class.forName("com.mysql.jdbc.Driver");
        
//        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        conn = DriverManager.getConnection(url);
        return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
    
    
    public boolean matchPasswordforAdmin(String user, String pass){
        boolean successful =false;
        try {
          
            Connection con = ConnectDb();  
            Statement st = con.createStatement();
            String sql = "SELECT * FROM admin where username = '"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
              String userName = rs.getString("username");
              String password = rs.getString("password");
              //successful = user.equals(userName) && pass.equals(password);
              if(user.equals(userName) && pass.equals(password)){
                  successful = true;
           //   JOptionPane.showMessageDialog(null, userName+ " Successfully");
              }
              else{
                  successful = false;
                //  JOptionPane.showMessageDialog(null, userName+ " Wrong Password");
              }
            }
            con.close();
        }
        catch(HeadlessException | SQLException sqlEx){
        //    JOptionPane.showMessageDialog(null,  " Error with connection");
        //            System.out.println(sqlEx);
        }     
        return successful;
    }
    
    public boolean matchPasswordforDoctor(String user, String pass){
        boolean successful =false;
        try {
          
            Connection con = ConnectDb();  
            Statement st = con.createStatement();
            String sql = "SELECT UserName,Password FROM doc where UserName = '"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
              String userName = rs.getString("UserName");
              String password = rs.getString("Password");
              //successful = user.equals(userName) && pass.equals(password);
              if(user.equals(userName) && pass.equals(password)){
                  successful = true;
           //   JOptionPane.showMessageDialog(null, userName+ " Successfully");
              }
              else{
                  successful = false;
                //  JOptionPane.showMessageDialog(null, userName+ " Wrong Password");
              }
            }
            con.close();
        }
        catch(HeadlessException | SQLException sqlEx){
        //    JOptionPane.showMessageDialog(null,  " Error with connection");
        //            System.out.println(sqlEx);
        }     
        return successful;
    }
    public boolean matchPasswordforREcep(String user, String pass){
        boolean successful =false;
        try {
          
            Connection con = ConnectDb();  
            Statement st = con.createStatement();
            String sql = "SELECT * FROM receptionist where username = '"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
              String userName = rs.getString("username");
              String password = rs.getString("password");
              //successful = user.equals(userName) && pass.equals(password);
              if(user.equals(userName) && pass.equals(password)){
                  successful = true;
            //  JOptionPane.showMessageDialog(null, userName+ " Successfully");
              }
              else{
                  successful = false;
               //   JOptionPane.showMessageDialog(null, userName+ " Wrong Password");
              }
            }
            con.close();
        }
        catch(HeadlessException | SQLException sqlEx){
        //    JOptionPane.showMessageDialog(null,  " Error with connection");
        //            System.out.println(sqlEx);
        }     
        return successful;
    }
    
    public void CloseConnection(){
    if (rst != null) {
        try {
            rst.close();
        } catch (SQLException e) {}}
    if (pst != null) {
        try {
            pst.close();
        } catch (SQLException e) {}}
    if (conn != null) {
        try {
            conn.close();
        } catch (SQLException e) {}}
    }
}
