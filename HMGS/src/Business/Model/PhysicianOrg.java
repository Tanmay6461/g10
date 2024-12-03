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

public class PhysicianOrg extends Organization {

    List<Physician> listOfPhysician;

    public PhysicianOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfPhysician = new ArrayList<>();
    }

    public List<Physician> getListOfPhysician() {
        return listOfPhysician;
    }

    public void setListOfPhysician(List<Physician> listOfPhysician) {
        this.listOfPhysician = listOfPhysician;
    }

    public void addPhysician(String name, String city, String user, String password1) {
        Physician physician = new Physician(name, city, user, password1);
        listOfPhysician.add(physician);
        System.out.println("Physisicna manager added is " + listOfPhysician.size());
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}

