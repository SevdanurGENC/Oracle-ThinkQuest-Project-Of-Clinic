
 
import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Sevdanur GENC
 */
public class Tbl_Doctors_Bean {
    
     Connection connection = null;
     private PreparedStatement st;
     private ResultSet rs;
    
     public Tbl_Doctors_Bean() 
     {
 
        try 
        {
            String drivername = "oracle.jdbc.driver.OracleDriver";
            Class.forName(drivername);
            String servername = "127.0.0.1";
            String portnumber = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+servername+":"+portnumber+":"+sid;
            String username = "SYSTEM";
            String password = "sys";
            connection = DriverManager.getConnection(url,username,password);
        } 
        catch (Exception ex) 
        {
          Logger.getLogger(Tbl_Doctors_Bean.class.getName()).log(Level.SEVERE, null, ex);
          
           System.out.println("error" + ex);  
              System.out.print("ok");  
         }
        
        
    }
     
     
     
     
     
      public List<Tbl_Doctors> List_Of_Doctors() throws SQLException
    {
        List<Tbl_Doctors> list_of_doctor = new ArrayList<Tbl_Doctors>();
        
        st = connection.prepareStatement("SELECT ID, DR_NAME, DR_SURNAME, BRANCH"
                + " FROM TBL_DOCTORS ORDER BY ID ASC");
        rs = st.executeQuery();
        
        while(rs.next())
        {
            Tbl_Doctors dr = new Tbl_Doctors();
            dr.setId(rs.getInt("id"));
            dr.setDr_Name(rs.getString("dr_name"));
            dr.setDr_Surname(rs.getString("dr_surname"));
            dr.setBranch(rs.getString("branch"));
             
            list_of_doctor.add(dr);
        }
        
        return list_of_doctor;
    }
     
     
    
    
    
      
       
    
}