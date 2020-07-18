/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fadime
 */
public class Tbl_Appointments {
    
    private int Row_Id;
    private String Patient_Name;
    private String Patient_Surname;
    private String Doctor_Name;
    private String Doctor_Surname;
    private String Appointment_Time;
    private String Appointment_Date;
    private String Branch;

    public Tbl_Appointments() {
    }

    public String getAppointment_Date() {
        return Appointment_Date;
    }

    public void setAppointment_Date(String Appointment_Date) {
        this.Appointment_Date = Appointment_Date;
    }

    public String getAppointment_Time() {
        return Appointment_Time;
    }

    public void setAppointment_Time(String Appointment_Time) {
        this.Appointment_Time = Appointment_Time;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public String getDoctor_Surname() {
        return Doctor_Surname;
    }

    public void setDoctor_Surname(String Doctor_Surname) {
        this.Doctor_Surname = Doctor_Surname;
    }

    public int getRow_Id() {
        return Row_Id;
    }

    public void setRow_Id(int Row_Id) {
        this.Row_Id = Row_Id;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getPatient_Surname() {
        return Patient_Surname;
    }

    public void setPatient_Surname(String Patient_Surname) {
        this.Patient_Surname = Patient_Surname;
    }
    
    
    
    
}
