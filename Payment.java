/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author basharhussain
 */
public class Payment {

    // Default constructor
    public Payment() {
    }

    // Method: selectPaymentType() : String
    public String selectPaymentType() {
        // You can replace this with actual logic later (e.g., reading from UI)
        return "Credit Card"; 
    }

    // Method: processPayment(amount : double, paymentType : String) : void
    public void processPayment(double amount, String paymentType) {
        // Basic placeholder logic
        System.out.println("Processing payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Payment Type: " + paymentType);
    }
}
