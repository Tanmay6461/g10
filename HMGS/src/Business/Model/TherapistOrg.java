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


public class TherapistOrg extends Organization {

    private List<Therapist> listOfTherapist;

    public TherapistOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTherapist = new ArrayList<>();
    }

    public List<Therapist> getListOfTherapist() {
        return listOfTherapist;
    }

    public void setListOfTherapist(List<Therapist> listOfTherapist) {
        this.listOfTherapist = listOfTherapist;
    }

    public void addTherapist(String name, String city, String user, String password1) {
        Therapist therapist = new Therapist(name, city, user, password1);
        listOfTherapist.add(therapist);
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}

