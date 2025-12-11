/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user;

/**
 *
 * @author k5n5k
 */
import java.util.ArrayList;

public class User {

    // === Attributes required by the UML ===
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;

    // Simulated database storage
    public static ArrayList<User> usersList = new ArrayList<>();

    // Constructor
    public User(int userId, String firstName, String lastName,
                String username, String password, String role) {

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // === login(username, password) : boolean ===
    public static boolean login(String username, String password) {
        for (User u : usersList) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    // === register() : void ===
    public void register() {
        usersList.add(this);
        System.out.println("User registered successfully.");
    }
}
