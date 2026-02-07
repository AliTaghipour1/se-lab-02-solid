package services;

import constants.Notifier;
import models.Customer;
import models.Room;

public class Reservation {
    public Room room;
    public Customer customer;
    public int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }

    public double totalPrice() {
        if (this.customer.city.equals("Paris")) {
            System.out.println("Apply city discount for Paris!");
            this.room.price *= 0.9;
        }
        return room.price * nights;
    }

    public void logInvoiceInfo() {
        System.out.println("----- INVOICE -----");
        System.out.println("hotel.Customer: " + this.customer.name);
        System.out.println("hotel.Room: " + this.room.number + " (" + this.room.type + ")");
        System.out.println("Total: " + this.totalPrice());
        System.out.println("-------------------");
    }

    public String getCustomerName() {
        return this.customer.name;
    }

    public String getCustomerContactPoint(Notifier notifier) {
        return switch (notifier) {
            case SMS -> this.customer.mobile;
            case EMAIL -> this.customer.email;
        };
    }
}