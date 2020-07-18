/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Userlogin {
    
    private int id;
    private String username;
    private String password;
    private Cls_Authorizations authorization_id;
    private String photo;
    
    public Cls_Userlogin()
    {
    
    }

    public Cls_Userlogin(int id, String username, String password, Cls_Authorizations authorization_id, String photo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorization_id = authorization_id;
        this.photo = photo;
    }

    public Cls_Authorizations getAuthorization_id() {
        return authorization_id;
    }

    public void setAuthorization_id(Cls_Authorizations authorization_id) {
        this.authorization_id = authorization_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

      
    
    
}
