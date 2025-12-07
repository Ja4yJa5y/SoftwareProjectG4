/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee extends Management {

    public Employee(String staffID, String staffName) {
        super(staffID, staffName);
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
}
