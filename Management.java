/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author basharhussain
 */
public class Management {

    // Attributes
    private String staffID;
    private String staffName;

    // Constructor
    public Management(String staffID, String staffName) {
        this.staffID = staffID;
        this.staffName = staffName;
    }

    // Getters and Setters
    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    // Method: updateBook(id : int, newPrice : double, newAvailability : boolean) : void
    public void updateBook(int id, double newPrice, boolean newAvailability) {
        // Placeholder logic - replace with database logic later
        System.out.println("Updating book with ID: " + id);
        System.out.println("New Price: " + newPrice);
        System.out.println("Available: " + newAvailability);
    }
}
