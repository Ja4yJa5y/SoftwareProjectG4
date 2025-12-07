/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager extends Management {

    public Manager(String staffID, String staffName) {
        super(staffID, staffName);
    }

    public void addBook(Connection conn,
                        String title,
                        String author,
                        String genre,
                        String type,
                        String language,
                        double price,
                        boolean availability) throws SQLException {

        String sql = "INSERT INTO BOOK (TITLE, AUTHOR, GENRE, TYPE, LANGUAGE, PRICE, AVAILABILITY) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, genre);
            ps.setString(4, type);
            ps.setString(5, language);
            ps.setDouble(6, price);
            ps.setBoolean(7, availability);
            ps.executeUpdate();
        }
    }

    @Override
    public void updateBook(Connection conn, int id, double newPrice, boolean newAvailability)
            throws SQLException {

        String sql = "UPDATE BOOK SET PRICE = ?, AVAILABILITY = ? WHERE BOOKID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newPrice);
            ps.setBoolean(2, newAvailability);
            ps.setInt(3, id);
            ps.executeUpdate();
        }
    }

    public void deleteBook(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM BOOK WHERE BOOKID = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public double viewProfitFromDB(Connection conn, double expenses) throws SQLException {
        String sql = "SELECT COALESCE(SUM(TOTALCOST), 0) AS revenue " +
                     "FROM PURCHASE WHERE PAYMENTSTATUS = 'success'";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            double revenue = 0;
            if (rs.next()) {
                revenue = rs.getDouble("revenue");
            }
            return revenue - expenses;
        }
    }

    public double viewProfit(double revenue, double expenses) {
        return revenue - expenses;
    }
}
