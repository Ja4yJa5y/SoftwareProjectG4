/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchui;

/**
 *
 * @author arfaj_sixefe7
 */
import javax.swing.*;

public class SearchUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchUI
     */
    public SearchUI() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245, 242, 235)); 
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        filterTitleButton = new javax.swing.JButton();
        filterAuthorButton = new javax.swing.JButton();
        filterGenreButton = new javax.swing.JButton();
        filterTypeButton = new javax.swing.JButton();
        resultsScrollPane = new javax.swing.JScrollPane();
        resultsList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 242, 235));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 32));
        titleLabel.setText("Search for Available Books");

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 16));
        searchField.setText("Enter keyword...");
        
        searchButton.setBackground(new java.awt.Color(25, 32, 65));
        searchButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        searchButton.setForeground(new java.awt.Color(245, 242, 235));
        searchButton.setText("Search");

        filterTitleButton.setBackground(new java.awt.Color(25, 32, 65));
        filterTitleButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        filterTitleButton.setForeground(new java.awt.Color(245, 242, 235));
        filterTitleButton.setText("Filter by Title");

        filterAuthorButton.setBackground(new java.awt.Color(25, 32, 65));
        filterAuthorButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        filterAuthorButton.setForeground(new java.awt.Color(245, 242, 235));
        filterAuthorButton.setText("Filter by Author");

        filterGenreButton.setBackground(new java.awt.Color(25, 32, 65));
        filterGenreButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        filterGenreButton.setForeground(new java.awt.Color(245, 242, 235));
        filterGenreButton.setText("Filter by Genre");

        filterTypeButton.setBackground(new java.awt.Color(25, 32, 65));
        filterTypeButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        filterTypeButton.setForeground(new java.awt.Color(245, 242, 235));
        filterTypeButton.setText("Filter by Type");

        resultsList.setFont(new java.awt.Font("Segoe UI", 0, 16));
        resultsScrollPane.setViewportView(resultsList);

        backButton.setBackground(new java.awt.Color(25, 32, 65));
        backButton.setFont(new java.awt.Font("InaiMathi", 1, 18));
        backButton.setForeground(new java.awt.Color(245, 242, 235));
        backButton.setText("Back to Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titleLabel)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterTitleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterAuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterGenreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60))
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(20)
                .addComponent(titleLabel)
                .addGap(20)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10)
                .addComponent(filterTitleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(filterAuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(filterGenreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(filterTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
        );

        getContentPane().add(jPanel1);
        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SearchUI().setVisible(true);
        });
    }

    private javax.swing.JButton searchButton;
    private javax.swing.JButton filterTitleButton;
    private javax.swing.JButton filterAuthorButton;
    private javax.swing.JButton filterGenreButton;
    private javax.swing.JButton filterTypeButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JList<String> resultsList;
}
