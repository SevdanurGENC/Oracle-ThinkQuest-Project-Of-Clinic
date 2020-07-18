/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Sevdanur GENC
 */
public class Cls_Authorizations {
 
    private int id;
    private String authorizations;
    
    
    public Cls_Authorizations()
    {
    
    }

    public Cls_Authorizations(int id, String authorizations) {
        this.id = id;
        this.authorizations = authorizations;
    }

    public String getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(String authorizations) {
        this.authorizations = authorizations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
