/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_List_Of_Treatment {
    
    
    private int id;
    private String name_of_treatment;
    private String cost;
    
    public Cls_List_Of_Treatment()
    {
        
    }

    public Cls_List_Of_Treatment(int id, String name_of_treatment, String cost) {
        this.id = id;
        this.name_of_treatment = name_of_treatment;
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_of_treatment() {
        return name_of_treatment;
    }

    public void setName_of_treatment(String name_of_treatment) {
        this.name_of_treatment = name_of_treatment;
    }
  
   
  
    
}
