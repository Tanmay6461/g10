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
public class EnterpriseDirectory {
    
     private List<Canteen> listOfCanteen;
    private List<Lab> listOfEvents;
    private List<HealthClub> listOfHealthClub;
    private List<Pharmacy> listOfRestaurants;

    public EnterpriseDirectory() {
        listOfCanteen = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfHealthClub = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
    }

    public List<Canteen> getListOfHotel() {
        return listOfCanteen;
    }

    public void setListOfHotel(List<Canteen> listOfCanteen) {
        this.listOfCanteen = listOfCanteen;
    }

    public List<Lab> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<Lab> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<HealthClub> getListOfHealthClub() {
        return listOfHealthClub;
    }

    public void setListOfHealthClub(List<HealthClub> listOfHealthClub) {
        this.listOfHealthClub = listOfHealthClub;
    }

    public List<Pharmacy> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void setListOfRestaurants(List<Pharmacy> listOfRestaurants) {
        this.listOfRestaurants = listOfRestaurants;
    }

    public void addHealthClub(String name, String contact) {
        HealthClub healthClub = new HealthClub(name, contact);
        listOfHealthClub.add(healthClub);
    }

    public void addRestaurant(String name, String contact) {
        Pharmacy restaurant = new Pharmacy(name, contact);
        listOfRestaurants.add(restaurant);
    }

    public void addBusinessEvent(String name, String contact) {
        Lab event = new Lab(name, contact);
        listOfEvents.add(event);
    }

    public void addHotel(String name, String contact) {
        Canteen canteen = new Canteen(name, contact);
        listOfCanteen.add(canteen);
    }

    public Canteen findHotel(String hotelName) {
        for (Canteen canteen : listOfCanteen) {
            if (canteen.getName().equals(hotelName)) {
                return canteen;
            }
        }
        return null;
    }

    public HealthClub findHealthClub(String clubName) {
        for (HealthClub club : listOfHealthClub) {
            if (club.getName().equals(clubName)) {
                return club;
            }
        }
        return null;
    }

    public Pharmacy findRestaurant(String name) {
        for (Pharmacy restaurant : listOfRestaurants) {
            if (restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public Lab findEvent(String name) {
        for (Lab event : listOfEvents) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public void deleteEnterpriseEvent(Lab event) {
        listOfEvents.remove(event);
    }

    public void deleteEnterpriseHealthClub(HealthClub health) {
        listOfHealthClub.remove(health);
    }

    public void deleteEnterpriseRestaurant(Pharmacy res) {
        listOfRestaurants.remove(res);
    }

    public void deleteEnterpriseHotel(Canteen canteen) {
        listOfCanteen.remove(canteen);
    }
}
