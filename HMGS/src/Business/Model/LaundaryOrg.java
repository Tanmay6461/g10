/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tanmay Paawar
 */
public class LaundaryOrg extends Organization{
    
     private List<LaundaryService> listOfLaundaryMan;

    public LaundaryOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfLaundaryMan = new ArrayList<>();
    }

    public List<LaundaryService> getListOfLaundaryMan() {
        return listOfLaundaryMan;
    }

    public void setListOfLaundaryMan(List<LaundaryService> listOfLaundaryMan) {
        this.listOfLaundaryMan = listOfLaundaryMan;
    }

    public void addLaundaryman(String name, String city, String user, String password1) {
        LaundaryService laundaryStaff = new LaundaryService(name, city, user, password1);
        listOfLaundaryMan.add(laundaryStaff);
        System.out.println("Deliveryman manager added is " + listOfLaundaryMan.size());
    }

    public void deleteManager(Manager man) {
       listOfManager.remove(man);
    }
}
