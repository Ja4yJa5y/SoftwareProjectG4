/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ja454
 */
class Cart {
    List<Double> bookPrices;

    public Cart() {
        bookPrices = new ArrayList<>();
    }

    // Method to add a book's price to the cart
    public void addBook(double bookPrice) {
        bookPrices.add(bookPrice);
    }

    // Method to calculate the total price of books in the cart 
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < bookPrices.size(); i++) {
            double price = bookPrices.get(i); 
            total += price; 
        }
        return total;
    }
     // Method to clear the cart
    public void clearCart() {
        bookPrices.clear(); 
        System.out.println("Cart has been cleared.");
    }
}


public class Payment {
//    Method to process payment
    static boolean paymentSuccess ;
    public static boolean processPayment(double amount, String paymentType) {
        Random random = new Random();
        paymentSuccess = random.nextBoolean(); // Randomly decide payment success or failure

        // Get the current date and time
        Date date = new Date();

        if (paymentSuccess == true) { 
            System.out.println("Payment suc"
                    + "Scessful!");
            System.out.println("Paid SAR" + amount + " using " + paymentType + " on " + date.toString());
            return true; // Payment successful
        } else {
            System.out.println("Payment failed!");
             return false; // Payment failed
        }
    }

    // Method to select payment type
    public static String selectPaymentType() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Select a payment type:");
        System.out.println("1. Visa");
        System.out.println("2. MasterCard");
        System.out.println("3. PayPal");
        System.out.println("4. Mada");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        String paymentType;

        
        switch (choice) {
            case 1:
                paymentType = "Visa";
                break;
            case 2:
                paymentType = "MasterCard";
                break;
            case 3:
                paymentType = "PayPal";
                break;
            case 4:
                paymentType = "Mada";
                break;
            default:
                paymentType = "Unknown";
                System.out.println("Invalid choice. Defaulting to 'Unknown Payment Type'.");
                paymentSuccess=false;
        }

        return paymentType;
    }
}
