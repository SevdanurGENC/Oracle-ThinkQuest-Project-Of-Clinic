/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Patients {
    
    private int id;
    private String name;
    private String surname;
    private String tc_identity;
    private String date_of_birth;
    private String mobile_phone;
    private String address;
    private String place_of_birth;
    private String town;

    
    public Cls_Patients()
    {
    }

    public Cls_Patients(int id, String name, String surname, String tc_identity, String date_of_birth, String mobile_phone, String address, String place_of_birth, String town) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tc_identity = tc_identity;
        this.date_of_birth = date_of_birth;
        this.mobile_phone = mobile_phone;
        this.address = address;
        this.place_of_birth = place_of_birth;
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTc_identity() {
        return tc_identity;
    }

    public void setTc_identity(String tc_identity) {
        this.tc_identity = tc_identity;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
    
    
    