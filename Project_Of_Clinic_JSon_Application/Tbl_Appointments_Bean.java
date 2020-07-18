/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fadime
 */
public class Tbl_Appointments_Bean {
    
      Connection connection = null;
     private PreparedStatement st;
     private ResultSet rs;
    
     public Tbl_Appointments_Bean() 
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
          Logger.getLogger(Tbl_Appointments_Bean.class.getName()).log(Level.SEVERE, null, ex);
          
           System.out.println("error" + ex);  
              System.out.print("ok");  
         } 
    } 
     
      public List<Tbl_Appointments> List_Of_Appointments() throws SQLException
    {
        List<Tbl_Appointments> list_of_appointments = new ArrayList<Tbl_Appointments>();
        
        st = connection.prepareStatement("SELECT ROW_ID,PATIENT_NAME,PATIENT_SURNAME,"
                + "DOCTOR_NAME,DOCTOR_SURNAME,APPOINTMENT_TIME,APPOINTMENT_DATE,"
                + "BRANCH FROM TBL_APPOINTMENTS ORDER BY ROW_ID ASC");
        rs = st.executeQuery();
        
        while(rs.next())
        {
            Tbl_Appointments appointments = new Tbl_Appointments();
            appointments.setRow_Id(rs.getInt("row_id"));
            appointments.setDoctor_Name(rs.getString("doctor_name"));
            appointments.setDoctor_Surname(rs.getString("doctor_surname"));
            appointments.setPatient_Name(rs.getString("patient_name"));
            appointments.setPatient_Surname(rs.getString("patient_surname"));
            appointments.setAppointment_Date(rs.getString("appointment_date"));
            appointments.setAppointment_Time(rs.getString("appointment_time"));
            appointments.setBranch(rs.getString("branch"));
            
            list_of_appointments.add(appointments);
        }
        
        return list_of_appointments;
    }
      
}
