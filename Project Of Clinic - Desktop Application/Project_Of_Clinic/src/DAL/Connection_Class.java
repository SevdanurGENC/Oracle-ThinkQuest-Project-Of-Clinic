/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Sevdanur GENC
 */
public class Connection_Class {
    
private Connection connect;

private String drivername = "oracle.jdbc.driver.OracleDriver";
private String servername = "127.0.0.1";
private String portnumber = "1521";
private String sid = "XE";

private String url = "jdbc:oracle:thin:@"+servername+":"+portnumber+":"+sid;

private String username = "SYSTEM";
private String password = "sys";

public Connection_Class()  
    {
        try 
        {           
            Class.forName(drivername);
            this.connect = DriverManager.getConnection(url,username,password);
            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Connection_Class.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Unable to connect to... " + ex.getMessage() + " - " + ex.getLocalizedMessage());
        }
        
   }


public Connection baglan() throws SQLException  
    {
        return this.connect;
    } 
    
    
}
