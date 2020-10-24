/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author Thilinika
 */
class User {
    
    private int id,hall,room,order,adservices,total;
    private String paymeth,name; 

    public User(int id, int hall, int room, int order, int adservices, int total, String paymeth, String name) {
        this.id = id;
        this.hall = hall;
        this.room = room;
        this.order = order;
        this.adservices = adservices;
        this.total = total;
        this.paymeth = paymeth;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getHall() {
        return hall;
    }

    public int getRoom() {
        return room;
    }

    public int getOrder() {
        return order;
    }

    public int getAdservices() {
        return adservices;
    }

    public int getTotal() {
        return total;
    }

    public String getPaymeth() {
        return paymeth;
    }

    public String getName() {
        return name;
    }
    
    
    
}
