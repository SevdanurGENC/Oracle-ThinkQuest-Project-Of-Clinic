/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Appointments {
    
    private int row_id;
    private Cls_Patients patient_name;
    private Cls_Patients patient_surname;
    private Cls_Doctors doctor_name;
    private Cls_Doctors doctor_surname;
    private String appointment_time;
    private String appointment_date;
    private String branch;
    
    public Cls_Appointments()
    {
        
    }

    public Cls_Appointments(int row_id, Cls_Patients patient_name, Cls_Patients patient_surname, Cls_Doctors doctor_name, Cls_Doctors doctor_surname, String appointment_time, String appointment_date, String branch) {
        this.row_id = row_id;
        this.patient_name = patient_name;
        this.patient_surname = patient_surname;
        this.doctor_name = doctor_name;
        this.doctor_surname = doctor_surname;
        this.appointment_time = appointment_time;
        this.appointment_date = appointment_date;
        this.branch = branch;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Cls_Doctors getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(Cls_Doctors doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Cls_Doctors getDoctor_surname() {
        return doctor_surname;
    }

    public void setDoctor_surname(Cls_Doctors doctor_surname) {
        this.doctor_surname = doctor_surname;
    }

    public Cls_Patients getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(Cls_Patients patient_name) {
        this.patient_name = patient_name;
    }

    public Cls_Patients getPatient_surname() {
        return patient_surname;
    }

    public void setPatient_surname(Cls_Patients patient_surname) {
        this.patient_surname = patient_surname;
    }

    public int getRow_id() {
        return row_id;
    }

    public void setRow_id(int row_id) {
        this.row_id = row_id;
    }

    
   
}
