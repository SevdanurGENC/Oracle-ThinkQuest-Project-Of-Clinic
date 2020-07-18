/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

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
/**
 *
 * @author Sevdanur GENC
 */
public class BLL_Authorizations {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;

    public BLL_Authorizations() 
    {
          try 
        {
            Connection_Class new_connect=new Connection_Class();
            connect=new_connect.baglan();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(BLL_Authorizations.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
        }
       
    }
    
      public boolean INSERT(Cls_Authorizations obje) throws SQLException
    {
        String SQL="Insert into tbl_authorizations(ID,authorization) values(?,?)";
      
        prs=connect.prepareStatement(SQL);
        
        prs.setInt(1, obje.getId());
        prs.setString(2, obje.getAuthorizations());
        
        return prs.execute();
    }
    
    
    
    
    
}
