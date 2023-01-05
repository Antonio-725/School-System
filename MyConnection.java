
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joji
 */
class MyConnection {
    public static Connection getConnection(){
    Connection con =null;
        try {
            Class.forName("com.mysql.jdbc..Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    con=DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
        return con;
    }
    
    
}
