/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.services;

import Business.Model.Enterprise;
import Business.Model.Organization;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ui.main.DateUtils;

/**
 *
 * @author Tanmay Paawar
 */
public abstract class Service {
 protected static final String TAB = "      ";

    static enum ServiceType {
        LAB,
        PHARMACY,
        HEALTH_CLUB,
        CANTEEN,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    protected Enterprise enterprise;
    private Status status;
    protected int totalCost;
    private List<Organization> listOfOrg;

    Service(Enterprise enterprise, ServiceType serviceType, Date date) {
        this.enterprise = enterprise;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtils.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrg = new ArrayList<>();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrganization(Organization org) {
        listOfOrg.add(org);
    }

    public List<Organization> getListOfOrg() {
        return listOfOrg;
    }

    public void setListOfOrg(List<Organization> listOfOrg) {
        this.listOfOrg = listOfOrg;
    }

    public abstract String toString();
}
