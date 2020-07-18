/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import Pojos.Cls_Personnel;
import Pojos.Cls_Authorizations;


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
public class BLL_Personnel {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
    public BLL_Personnel() 
    {
        try 
        {
            Connection_Class new_connect=new Connection_Class();
            connect=new_connect.baglan();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(BLL_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
        }
       
    }
    
    public boolean INSERT(Cls_Personnel obje) throws SQLException
    {
        String SQL="Insert into tbl_personnel(id,tc_identity,register_identity,authorization_id,name,"
                + "surname,misson,department) values(?,?,?,?,?,?,?,?)";
       
        prs=connect.prepareStatement(SQL);
        
        prs.setInt(1, obje.getId());
        prs.setString(2, obje.getTc_identity());
        prs.setString(3, obje.getRegister_identity());
        prs.setInt(4, obje.getAuthorization_id().getId());
        prs.setString(5, obje.getName());
        prs.setString(6, obje.getSurname());
        prs.setString(7, obje.getMisson());
        prs.setString(8, obje.getDepartment());
     
        return prs.execute();
    }
    
    
    public boolean DELETE(int id) throws SQLException
    {
        String SQL="Delete from tbl_personnel where id=?";
        prs=connect.prepareStatement(SQL);
        prs.setInt(1, id);
        return prs.execute();

    }
    
       public boolean UPDATE(Cls_Personnel obje) throws SQLException
       {
            String SQL="UPDATE tbl_personnel set tc_identity=?,register_identity=?,authorization_id=?,name=?,surname=?,"
                    + "misson=?,department=? where id=?";
        
            prs=connect.prepareStatement(SQL);

            prs.setString(1, obje.getTc_identity());
            prs.setString(2, obje.getRegister_identity());
            prs.setInt(3, obje.getAuthorization_id().getId());
            prs.setString(4, obje.getName());
            prs.setString(5, obje.getSurname());
            prs.setString(6, obje.getMisson());
            prs.setString(7, obje.getDepartment());
            prs.setInt(8, obje.getId());

            return prs.execute();
       }
    
     
        public Cls_Personnel SELECT(int id) throws SQLException
        {
        String SQL="SELECT * FROM tbl_personnel WHERE id=?";
        prs=connect.prepareStatement(SQL);

        prs.setInt(1, id);
        res=prs.executeQuery();

        Cls_Personnel pb= new Cls_Personnel();
   
        while(res.next())
            {
                 Cls_Authorizations Create = new Cls_Authorizations();
                 Create.getId();
                
                pb.setId(res.getInt("id"));
                pb.setTc_identity(res.getString("tc_identity"));
                pb.setRegister_identity(res.getString("register_identity"));
                
                pb.setAuthorization_id(Create);
                
                pb.setName(res.getString("name"));
                pb.setSurname(res.getString("surname"));
                pb.setMisson(res.getString("misson"));
                pb.setDepartment(res.getString("department"));

            }
            return pb;
        }
    
         public List<Cls_Personnel> FINDALL() throws SQLException
    {
         Cls_Authorizations _Create = new Cls_Authorizations();
                _Create.getId();
                
        String SQL="SELECT * FROM tbl_personnel";
      
        prs=connect.prepareStatement(SQL);
        res=prs.executeQuery();
   
      
        List<Cls_Personnel> make_a_list = new ArrayList<Cls_Personnel>();
          while(res.next())
          {
 //      make_a_list.add(new Cls_Personel(res.getInt("id"), res.getString("tcno"), res.getString("sicilno"), 
//              res.getInt("yetki_id"), res.getString("isim"), res.getString("soyisim"), 
//              res.getString("gorevi"), res.getString("departmani")));

        }
    return make_a_list;
    }
    
       
    
}
