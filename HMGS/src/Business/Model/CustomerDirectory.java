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


public class CustomerDirectory {

    private List<Customer> listOfCustomer;

    public CustomerDirectory() {
        listOfCustomer = new ArrayList<>();
    }

    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(List<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }

    public Customer addCustomer() {
        Customer customer = new Customer();
        listOfCustomer.add(customer);
        return customer;
    }

    public Customer findCustomerUsername(String username) {
        for (int i = 0; i < listOfCustomer.size(); i++) {
            if (listOfCustomer.get(i).getUserName().equals(username)) {
                return listOfCustomer.get(i);
            }
        }
        return null;
    }

}
