/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Pojos.Cls_List_Of_Treatment;

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
public class BLL_List_Of_Treatment {
    
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    Statement st ;
    
    public BLL_List_Of_Treatment() 
    {
           try 
        {
            Connection_Class new_connect=new Connection_Class();
            connect=new_connect.baglan();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(BLL_List_Of_Treatment.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"To Link Failure On BLL Layer... ");
        }
    }        
           
    public boolean INSERT(Cls_List_Of_Treatment obje) throws SQLException
    {
        String SQL="Insert into tbl_list_of_treatment obje(id,name_of_treatment,cost) values(?,?,?)";
        prs=connect.prepareStatement(SQL);
        
        prs.setInt(1, obje.getId());
        prs.setString(2, obje.getName_of_treatment());
        prs.setString(3, obje.getCost());        
        
        return prs.execute();
    }
    
    public boolean DELETE(int id) throws SQLException
    {
        String SQL="Delete from tbl_list_of_treatment where id=?";
        prs=connect.prepareStatement(SQL);
        prs.setInt(1, id);
        return prs.execute();

    }
    
   public boolean UPDATE(Cls_List_Of_Treatment obje) throws SQLException
   {
        String SQL="UPDATE tbl_list_of_treatment set name_of_treatment=?,cost=? where id=?";
        prs=connect.prepareStatement(SQL);

        prs.setString(1, obje.getName_of_treatment());
        prs.setString(2, obje.getCost());
        prs.setInt(3, obje.getId());
        
        return prs.execute();
   }
   
    public Cls_List_Of_Treatment SELECT(int id) throws SQLException
    {
        String SQL="SELECT * FROM tbl_list_of_treatment WHERE id=?";
        prs=connect.prepareStatement(SQL);

        prs.setInt(1, id);
        res=prs.executeQuery();

        Cls_List_Of_Treatment pb= new Cls_List_Of_Treatment();

        while(res.next())
            {
                pb.setId(res.getInt("id"));
                pb.setName_of_treatment(res.getString("name_of_treatment"));
                pb.setCost(res.getString("cost"));

            }
            return pb;
    }
    
    public List<Cls_List_Of_Treatment> FINDALL() throws SQLException
    {
        String SQL="SELECT * FROM tbl_list_of_treatment";
        prs=connect.prepareStatement(SQL);
        res=prs.executeQuery();
       
        List<Cls_List_Of_Treatment> make_a_list = new ArrayList<Cls_List_Of_Treatment>();
          while(res.next())
          {
          make_a_list.add(new Cls_List_Of_Treatment(res.getInt("id"),res.getString("name_of_treatment"),res.getString("cost")));

        }
    return make_a_list;
    }    
           
           
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
