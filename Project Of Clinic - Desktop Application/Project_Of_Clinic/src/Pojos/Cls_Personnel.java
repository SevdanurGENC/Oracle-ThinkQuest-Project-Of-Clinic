/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Personnel {
    
    private int id;
    private String tc_identity;
    private String register_identity;
 
    private Cls_Authorizations authorization_id;
    
    private String name;
    private String surname;
    private String misson;
    private String department;

    public Cls_Personnel()
    {
        
    }

    public Cls_Personnel(int id, String tc_identity, String register_identity, Cls_Authorizations authorization_id, String name, String surname, String misson, String department) {
        this.id = id;
        this.tc_identity = tc_identity;
        this.register_identity = register_identity;
        this.authorization_id = authorization_id;
        this.name = name;
        this.surname = surname;
        this.misson = misson;
        this.department = department;
    }

    public Cls_Authorizations getAuthorization_id() {
        return authorization_id;
    }

    public void setAuthorization_id(Cls_Authorizations authorization_id) {
        this.authorization_id = authorization_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMisson() {
        return misson;
    }

    public void setMisson(String misson) {
        this.misson = misson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister_identity() {
        return register_identity;
    }

    public void setRegister_identity(String register_identity) {
        this.register_identity = register_identity;
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
    
    
    
    
    
}
