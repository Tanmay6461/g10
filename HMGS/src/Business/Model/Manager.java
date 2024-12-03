/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author Tanmay Paawar
 */
public class Manager extends Person {
    
    private String contact;

    public Manager(String name,String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }
            
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
