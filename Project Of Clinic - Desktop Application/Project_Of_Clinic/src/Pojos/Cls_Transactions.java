/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Transactions {
    
    private int row_id;
    private Cls_Patients patients_id;
    private String date_of_inspection;
    private Cls_Doctors doctors_id;
    private Cls_List_Of_Treatment treatment_id;
    private String notes;
    
    
      public Cls_Transactions()
     {
         
     }

    public Cls_Transactions(int row_id, Cls_Patients patients_id, String date_of_inspection,
            Cls_Doctors doctors_id, Cls_List_Of_Treatment treatment_id, String notes) {
        this.row_id = row_id;
        this.patients_id = patients_id;
        this.date_of_inspection = date_of_inspection;
        this.doctors_id = doctors_id;
        this.treatment_id = treatment_id;
        this.notes = notes;
    }

    public String getDate_of_inspection() {
        return date_of_inspection;
    }

    public void setDate_of_inspection(String date_of_inspection) {
        this.date_of_inspection = date_of_inspection;
    }

    public Cls_Doctors getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(Cls_Doctors doctors_id) {
        this.doctors_id = doctors_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Cls_Patients getPatients_id() {
        return patients_id;
    }

    public void setPatients_id(Cls_Patients patients_id) {
        this.patients_id = patients_id;
    }

    public int getRow_id() {
        return row_id;
    }

    public void setRow_id(int row_id) {
        this.row_id = row_id;
    }

    public Cls_List_Of_Treatment getTreatment_id() {
        return treatment_id;
    }

    public void setTreatment_id(Cls_List_Of_Treatment treatment_id) {
        this.treatment_id = treatment_id;
    }
    
      
      
      
      
      
}
