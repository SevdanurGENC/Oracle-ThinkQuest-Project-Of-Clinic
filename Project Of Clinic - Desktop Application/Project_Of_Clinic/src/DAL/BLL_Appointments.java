/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Pojos.Cls_Doctors;
import Pojos.Cls_Patients;
import Pojos.Cls_Appointments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sevdanur GENC
 */
public class BLL_Appointments {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
    public BLL_Appointments() 
    {
        try 
        {
            Connection_Class new_connect=new Connection_Class();
            connect=new_connect.baglan();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(BLL_Appointments.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
        }
       
    }
    
     public boolean INSERT(Cls_Appointments obje) throws SQLException
    {
        
        String SQL="Insert into tbl_appointments(row_id,patient_name,patient_surname,"
                + "doctor_name,doctor_surname,appointment_time,appointment_date,branch) values(?,?,?,?,?,?,?,?)";
      
        prs=connect.prepareStatement(SQL);
         
        prs.setInt(1, obje.getRow_id());
        prs.setString(2, obje.getPatient_name().getName());
        prs.setString(3, obje.getPatient_surname().getSurname());
        prs.setString(4, obje.getDoctor_name().getDr_name());
        prs.setString(5, obje.getDoctor_surname().getDr_surname());
        prs.setString(6, obje.getAppointment_time());
        prs.setString(7, obje.getAppointment_date());
        prs.setString(8, obje.getBranch());
       
        return prs.execute();
    }
     
     
    public boolean DELETE(int id) throws SQLException
    {
        String SQL="Delete from tbl_appointments where row_id=?";
        prs=connect.prepareStatement(SQL);
        prs.setInt(1, id);
        return prs.execute();

    }
    
   public boolean UPDATE(Cls_Appointments obje) throws SQLException
   {
        String SQL="UPDATE tbl_appointments set patient_name=?,patient_surname=?,doctor_name=?,doctor_surname=?,"
                + "appointment_time=?,appointment_date=?,branch=? where row_id=?";
        
        prs=connect.prepareStatement(SQL);
 
        prs.setString(1, obje.getPatient_name().getName());
        prs.setString(2, obje.getPatient_surname().getSurname());
        prs.setString(3, obje.getDoctor_name().getDr_name());
        prs.setString(4, obje.getDoctor_surname().getDr_surname());
        prs.setString(5, obje.getAppointment_time());
        prs.setString(6, obje.getAppointment_date());
        prs.setString(7, obje.getBranch());
        prs.setInt(9, obje.getRow_id());
   
        
        return prs.execute();
   }
   
    public Cls_Appointments SELECT(int id) throws SQLException
    {
        String SQL="SELECT * FROM tbl_appointments WHERE row_id=?";
        prs=connect.prepareStatement(SQL);

        prs.setInt(1, id);
        res=prs.executeQuery();

        Cls_Appointments pb= new Cls_Appointments();

        while(res.next())
            {

                pb.setRow_id(res.getInt("row_id"));

                     Cls_Patients Create = new Cls_Patients();
                        Create.getName();
                        Create.getSurname();
                        
                        pb.setPatient_name(Create);
                        pb.setPatient_surname(Create);

                    Cls_Doctors _Create = new Cls_Doctors();
                        _Create.getDr_name();
                        _Create.getDr_surname();
                        
                        pb.setDoctor_name(_Create);
                        pb.setDoctor_surname(_Create);

                pb.setAppointment_time(res.getString("appointment_time"));
                pb.setAppointment_date(res.getString("appointment_date"));
                pb.setBranch(res.getString("branch"));

            }
            return pb;
    }
    
    public List<Cls_Appointments> FINDALL() throws SQLException
    {
        String SQL="SELECT * FROM tbl_appointments";
        prs=connect.prepareStatement(SQL);
        res=prs.executeQuery();
       
        List<Cls_Appointments> Liste = new ArrayList<Cls_Appointments>();
          while(res.next())
          {
 //     Liste.add(new Cls_Randevular(res.getInt("sirano"),res.getString("isim"),res.getString("soyisim"), res.getString("tckimlik"),res.getString("dogumtarihi"), res.getString("ceptel"),res.getString("dogumyeri"),res.getString("adres"),res.getString("sehir")));

        }
    return Liste;
    }
    
    
    
}
