/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Doctors {
    
    private int id;
    private String dr_name;
    private String dr_surname;
    private String certificate_no;
    private String branch;
    private String address;
    private String town;
    private String place_of_birth;
    private String date_of_birth;
    private String telephone;
    
    public Cls_Doctors()
    {
        
    }
    
    
     public Cls_Doctors(int id, String dr_name, String dr_surname, String certificate_no, String branch, String address, String town, String place_of_birth, String date_of_birth, String telephone) 
     {
        this.id = id;
        this.dr_name = dr_name;
        this.dr_surname = dr_surname;
        this.certificate_no = certificate_no;
        this.branch = branch;
        this.address = address;
        this.town = town;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(String certificate_no) {
        this.certificate_no = certificate_no;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public String getDr_surname() {
        return dr_surname;
    }

    public void setDr_surname(String dr_surname) {
        this.dr_surname = dr_surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
     
     
    
    
    
    
}
