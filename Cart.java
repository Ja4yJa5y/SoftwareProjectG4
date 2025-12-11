/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cart;

/**
 *
 * @author arfaj_sixefe7
 */
import java.util.ArrayList;

public class Cart {

    private ArrayList<Double> prices;
    private double total;

    public Cart() {
        this.prices = new ArrayList<>();
        this.total = 0.0;
    }

    public void addBook(double price) {
        if (price < 0) return; 
        prices.add(price);
        total += price;
    }

    public double calculateTotal() {
        double sum = 0.0;
        for (double p : prices) {
            sum += p;
        }
        total = sum;
        return total;
    }

    public void clearCart() {
        prices.clear();
        total = 0.0;
    }

    public double getTotal() {
        return total;
    }


    public void removeBook(double price) {
        if (prices.remove(price)) {
            calculateTotal();
        }
    }
}
