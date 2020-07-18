/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Sevdanur GENC
 */




import PBS.Frm_Admin_Screen;
import PBS.Frm_Doctor_Screen;
import PBS.Frm_Personnel_Screen;


/* BURASI ONEMLI FORM ISIMLEIRNI YUKARDA YENIDEN TANIMLAMALISINNNNNNNNNN   */


import Pojos.Cls_Userlogin;
import Pojos.Cls_Authorizations;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 

public class BLL_Userlogin {

    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
    private Component rootPane;
 
    public BLL_Userlogin() 
    {
        try 
        {
            Connection_Class new_connect=new Connection_Class();
            connect=new_connect.baglan();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(BLL_Userlogin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
        }
       
    }
       
    public Cls_Userlogin SELECT(String User_Name,String Pass,int Auth_Id) throws SQLException
 {
    String SQL="SELECT * FROM tbl_userlogin WHERE username=? and password=? and authorization_id=?";
    prs=connect.prepareStatement(SQL);
    
    prs.setString(1, User_Name);
    prs.setString(2, Pass);
    prs.setInt(3, Auth_Id);
    
    res=prs.executeQuery();
    
    Cls_Userlogin pb= new Cls_Userlogin();
    
    while(res.next())
        {
            Cls_Authorizations Create = new Cls_Authorizations();
            Create.getId();
            
            pb.setUsername(res.getString("username"));
            pb.setPassword(res.getString("password"));
            pb.setAuthorization_id(Create);

            pb.setPhoto(res.getString("photo"));
            
            JOptionPane.showMessageDialog(rootPane, "Successful Introduction, Welcome!...");
            
               if(Auth_Id==1)  //admin
               {        
                    Frm_Admin_Screen adminpanel = new Frm_Admin_Screen();
                    adminpanel.setVisible(true);  
                  
               }
               else if(Auth_Id==2)  //doktor
               {
                   Frm_Doctor_Screen doktorpanel = new Frm_Doctor_Screen();
                    doktorpanel.setVisible(true);  
                 
               }
               else if(Auth_Id==3)  //personel
               {
                   Frm_Personnel_Screen personelpanel = new Frm_Personnel_Screen();
                   personelpanel.setVisible(true);      
                   
               } 
         }
        return pb;
    }
    
    
    
    public boolean UPDATE(Cls_Userlogin obje) throws SQLException
   {
        String SQL="UPDATE tbl_userlogin set username=?, password=?, authorization_id=?, photo=? where id=?";
      
        prs=connect.prepareStatement(SQL);
    
        prs.setString(1, obje.getUsername());
        prs.setString(2, obje.getPassword());
        prs.setInt(3, obje.getAuthorization_id().getId()); 
        prs.setString(4, obje.getPhoto()); 
        prs.setInt(5, obje.getId());
        
        return prs.execute();
   }
 
     public boolean INSERT(Cls_Userlogin obje) throws SQLException
    {
        String SQL="Insert into tbl_userlogin(id,username,password,authorization_id,photo) values(?,?,?,?,?)";
     
        prs=connect.prepareStatement(SQL);
         
        prs.setInt(1, obje.getId());
        prs.setString(2, obje.getUsername());
        prs.setString(3, obje.getPassword());
        prs.setInt(4, obje.getAuthorization_id().getId());
        prs.setString(5, obje.getPhoto());    
        
        return prs.execute();
    }
    
}
