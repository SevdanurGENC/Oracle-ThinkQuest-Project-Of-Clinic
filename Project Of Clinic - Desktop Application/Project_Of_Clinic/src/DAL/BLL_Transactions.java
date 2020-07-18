/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import Pojos.Cls_Transactions;

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
public class BLL_Transactions {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
        public BLL_Transactions() 
        {
            try 
            {
                Connection_Class new_connect=new Connection_Class();
                connect=new_connect.baglan();
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(BLL_Transactions.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
            }
        }
    
    
        public boolean INSERT(Cls_Transactions obje) throws SQLException
        {
            String SQL="Insert into tbl_transactions(row_id,patients_id,date_of_inspection,doctors_id,treatment_id,notes) "
                    + "values(?,?,?,?,?,?)";
           
            prs=connect.prepareStatement(SQL);

            prs.setInt(1, obje.getRow_id());
            prs.setInt(2, obje.getPatients_id().getId());
            prs.setString(3, obje.getDate_of_inspection());
            prs.setInt(4, obje.getDoctors_id().getId());
            prs.setInt(5, obje.getTreatment_id().getId());
            prs.setString(6, obje.getNotes());

            return prs.execute();
        }
    
    
}
