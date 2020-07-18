/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import Pojos.Cls_Doctors;


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
public class BLL_Doctors {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
        public BLL_Doctors() 
        {
             try 
            {
                Connection_Class new_connect=new Connection_Class();
                connect=new_connect.baglan();
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(BLL_Doctors.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
            }
        }   
           
        public boolean INSERT(Cls_Doctors obje) throws SQLException 
        {            
        String SQL="Insert into tbl_doctors(id,dr_name,dr_surname,certificate_no,branch,"
                + "address,town,place_of_birth,date_of_birth,telephone) values(?,?,?,?,?,?,?,?,?,?)";
     
        prs=connect.prepareStatement(SQL);

        prs.setInt(1, obje.getId());
        prs.setString(2, obje.getDr_name());
        prs.setString(3, obje.getDr_surname());
        prs.setString(4, obje.getCertificate_no());
        prs.setString(5, obje.getBranch()); 
        prs.setString(6, obje.getAddress()); 
        prs.setString(7, obje.getTown()); 
        prs.setString(8, obje.getPlace_of_birth()); 
        prs.setString(9, obje.getDate_of_birth()); 
        prs.setString(10, obje.getTelephone()); 
        
        return prs.execute();
        }    
       
        public boolean DELETE(int id) throws SQLException
        {
        String SQL="Delete from tbl_doctors where id=?";
        prs=connect.prepareStatement(SQL);
        prs.setInt(1, id);
        return prs.execute();
        }
     
        public boolean UPDATE(Cls_Doctors obje) throws SQLException
        {
       
        String SQL="UPDATE tbl_doctors set dr_name=?,dr_surname=?,certificate_no=?,branch=?,"
                + "address=?,town=?,date_of_birth=?,place_of_birth=?,telephone=? where id=?";
    
        prs=connect.prepareStatement(SQL);

        prs.setString(1, obje.getDr_name());
        prs.setString(2, obje.getDr_surname());
        prs.setString(3, obje.getCertificate_no());
        prs.setString(4, obje.getBranch()); 
        prs.setString(5, obje.getAddress()); 
        prs.setString(6, obje.getTown()); 
        prs.setString(7, obje.getPlace_of_birth()); 
        prs.setString(8, obje.getDate_of_birth()); 
        prs.setString(9, obje.getTelephone()); 
        prs.setInt(10, obje.getId());
        
        return prs.execute();
        }
          
        public Cls_Doctors SELECT(int id) throws SQLException
        {
        String SQL="SELECT * FROM tbl_doctors WHERE id=?";
        prs=connect.prepareStatement(SQL);

        prs.setInt(1, id);
        res=prs.executeQuery();

        Cls_Doctors pb= new Cls_Doctors();

        while(res.next())
            {
                pb.setId(res.getInt("id"));
                pb.setDr_name(res.getString("dr_name"));
                pb.setDr_surname(res.getString("dr_surname"));
                pb.setBranch(res.getString("branch"));
                pb.setCertificate_no(res.getString("certificate_no"));
                pb.setAddress(res.getString("address"));
                pb.setPlace_of_birth(res.getString("place_of_birth"));
                pb.setDate_of_birth(res.getString("date_of_birth"));
                pb.setTown(res.getString("town"));
                pb.setTelephone(res.getString("telephone"));

            }
            return pb;
        }
        
        public List<Cls_Doctors> FINDALL() throws SQLException
        {
            String SQL="SELECT * FROM tbl_doctors";
            prs=connect.prepareStatement(SQL);
            res=prs.executeQuery();

            List<Cls_Doctors> make_a_list = new ArrayList<Cls_Doctors>();
            
          while(res.next())
            {
             make_a_list.add(new Cls_Doctors(res.getInt("id"),res.getString("dr_name"),res.getString("dr_surname"), 
                     res.getString("certificate_no"), res.getString("branch"), res.getString("address"),
                     res.getString("place_of_birth"),res.getString("date_of_birth"),res.getString("town"),
                     res.getString("telephone")));

            }
         return make_a_list;
         }
  
           
       
           
}
           
           
           
           
           
           
           
           
           
           
  
    
    
    
  