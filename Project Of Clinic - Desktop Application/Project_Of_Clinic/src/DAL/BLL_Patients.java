/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sevdanur GENC
 */
package DAL;
import Pojos.Cls_Patients;

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


public class BLL_Patients 
{
    Connection Connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
            public BLL_Patients() 
            {
                   try 
                {
                    Connection_Class new_connec=new Connection_Class();
                    Connect=new_connec.baglan();
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(BLL_Patients.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
                }

            }
            
            public boolean INSERT(Cls_Patients obje) throws SQLException
            {
                String SQL="Insert into tbl_patients(id,name,surname,tc_identity,"
                        + "date_of_birth,mobile_phone,address,place_of_birth,town) values(?,?,?,?,?,?,?,?,?)";
             
                prs=Connect.prepareStatement(SQL);

                prs.setInt(1, obje.getId());
                prs.setString(2, obje.getName());
                prs.setString(3, obje.getSurname());
                prs.setString(4, obje.getTc_identity());
                prs.setString(5, obje.getDate_of_birth());
                prs.setString(6, obje.getMobile_phone());
                prs.setString(7, obje.getAddress());
                prs.setString(8, obje.getPlace_of_birth());
                prs.setString(9, obje.getTown());
        
                return prs.execute();
            }
            
            
            public boolean DELETE(int id) throws SQLException
            {
                String SQL="Delete from tbl_patients where id=?";
                prs=Connect.prepareStatement(SQL);
                prs.setInt(1, id);
                return prs.execute();

            }
            
            public boolean UPDATE(Cls_Patients obje) throws SQLException
           {
                String SQL="UPDATE tbl_patients set name=?,surname=?,tc_identity=?,date_of_birth=?,"
                        + "mobile_phone=?,address=?,place_of_birth=?,town=? where id=?";
             
                prs=Connect.prepareStatement(SQL);

                prs.setString(1, obje.getName());
                prs.setString(2, obje.getSurname());
                prs.setString(3, obje.getTc_identity());
                prs.setString(4, obje.getDate_of_birth());
                prs.setString(5, obje.getMobile_phone());
                prs.setString(6, obje.getAddress());
                prs.setString(7, obje.getPlace_of_birth());
                prs.setString(8, obje.getTown());
                prs.setInt(9, obje.getId());
              
               return prs.execute();
           }
            
            public Cls_Patients SELECT(int id) throws SQLException
            {
                String SQL="SELECT * FROM tbl_patients WHERE id=?";
                prs=Connect.prepareStatement(SQL);

                prs.setInt(1, id);
                res=prs.executeQuery();

                Cls_Patients pb= new Cls_Patients();

                while(res.next())
                    {
                        pb.setId(res.getInt("id"));
                        pb.setName(res.getString("name"));
                        pb.setSurname(res.getString("surname"));
                        pb.setTc_identity(res.getString("tc_identity"));
                        pb.setDate_of_birth(res.getString("date_of_birth"));
                        pb.setMobile_phone(res.getString("mobile_phone"));
                        pb.setAddress(res.getString("address"));
                        pb.setPlace_of_birth(res.getString("place_of_birth"));
                        pb.setTown(res.getString("town"));

                    }
                return pb;
            }
   
            
             public List<Cls_Patients> FINDALL() throws SQLException
            {
                String SQL="SELECT * FROM tbl_patients";
                prs=Connect.prepareStatement(SQL);
                res=prs.executeQuery();

                List<Cls_Patients> make_a_list = new ArrayList<Cls_Patients>();
                  while(res.next())
                  {
                    make_a_list.add(new Cls_Patients(res.getInt("id"),res.getString("name"),res.getString("surname"),
                            res.getString("tc_identity"),res.getString("date_of_birth"), res.getString("mobile_phone"),
                            res.getString("place_of_birth"),res.getString("address"),res.getString("town")));

                }
            return make_a_list;
            }
                    
    
}
