/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.services;

import Business.Model.Canteen;
import Business.Model.RoomList;
import static java.awt.Event.TAB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ui.main.DateUtils;

/**
 *
 * @author Tanmay Paawar
 */
public class CanteenService extends Service {

    public static enum CanteenServiceType {
        LAUNDARY(10),
        TRANSPORTATION(20);

        private final int price;

        private CanteenServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private RoomList roomlist;
    private List<CanteenServiceType> canteenServices;

    public CanteenService(Canteen canteen) {
//        super(canteen, Service.ServiceType.CANTEEN, DateUtils.now());
        super(canteen, Service.ServiceType.CANTEEN, DateUtils.now());
        this.canteenServices = new ArrayList<>();
        this.roomlist = new RoomList();
    }

    public List<CanteenServiceType> getCanteenService() {
        return canteenServices;
    }

    public void setCanteenService(List<CanteenServiceType> canteenServices) {
        this.canteenServices = canteenServices;
    }

    public RoomList getRoomlist() {
        return roomlist;
    }

    public void setRoomlist(RoomList roomlist) {
        this.roomlist = roomlist;
    }

    public void addService(CanteenService.CanteenServiceType type) {
        canteenServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nHotel service details:");
        sb.append("\n").append(TAB).append("Hotel: ").append(enterprise);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (canteenServices == null || canteenServices.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for your booking:");
            for (CanteenService.CanteenServiceType service : canteenServices) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total cost for hotel: $").append(totalCost);
        }
        return sb.toString();
    }
    
}
