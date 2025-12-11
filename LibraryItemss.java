/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraryitemss;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author k5n5k
 */

public class LibraryItemss {

     private int Id;
    private String Title;
    private String Author;
    private double Price;
    private String Genre;
    private String type;
    private boolean availability;
    public static ArrayList<LibraryItemss> libraryItemsList = new ArrayList<>();

    public LibraryItemss(int Id, String Title, String Author, double Price, String Genre, String type) {
        this.Id = Id;
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
        this.Genre = Genre;
        this.type = type;
        this.availability = true;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean aAvailability) {
        this.availability = aAvailability;
    }

    public static LibraryItemss findBookById(int bookID) {
        for (LibraryItemss book : libraryItemsList) {
            if (book.getId() == bookID) {
                return book;
            }
        }
        return null;
    }

    public static LibraryItemss findBookByTitle(String title) {
        for (LibraryItemss book : libraryItemsList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "[ " + type + ", Title= " + Title + ", Author= " + Author + ", Price= " + Price +
                ", Availability= " + (availability ? "Available" : "Not Available") + ", Genre= " + Genre + " ]";
    }
}

class EBook extends LibraryItemss {
    private String language;
    private String fileFormat;
    private String downloadLink;

    public EBook(int id, String title, String author, double price, String genre,
                 String language, String fileFormat, String downloadLink) {
        super(id, title, author, price, genre, "EBook");
        this.language = language;
        this.fileFormat = fileFormat;
        this.downloadLink = downloadLink;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public String toString() {
        return super.toString() + ", Language= " + language +
                ", Format= " + fileFormat + ", Link= " + downloadLink + " ]";
    }
}

class BorrowedBooks {

    // This list is not in the UML, but it's an internal detail to store records.
    private static ArrayList<BorrowedBooks> borrowedList = new ArrayList<>();

    // === Attributes (exactly as in the file) ===
    private int borrowId;
    private int userId;
    private int bookId;
    private Date borrowDate;
    private Date returnDueDate;
    private Date returnDate;
    private String status;

    // Constructor (UML doesn’t define it, so we are free to choose)
    public BorrowedBooks(int borrowId, int userId, int bookId, Date borrowDate, Date returnDueDate) {
        this.borrowId = borrowId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDueDate = returnDueDate;
        this.returnDate = null;
        this.status = "BORROWED";
    }

    // ===============================
    //  Methods as required by the UML
    // ===============================

    // borrowBook(title : String) : void
    public static void borrowBook(String title) {
        // In a real system, userId should come from the logged-in user.
        // Here we just use a placeholder value.
        int currentUserId = 1; // TODO: replace with actual logged-in user id

        for (LibraryItemss item : LibraryItemss.libraryItemsList) {
            if (item.getTitle().equalsIgnoreCase(title)) {

                if (!item.isAvailability()) {
                    System.out.println("This book is already borrowed.");
                    return;
                }

                // Mark book as unavailable
                item.setAvailability(false);

                // Create borrow record (borrowId = size + 1)
                BorrowedBooks record = new BorrowedBooks(
                        borrowedList.size() + 1,
                        currentUserId,
                        item.getId(),
                        new Date(),
                        new Date(System.currentTimeMillis() + (7L * 24 * 60 * 60 * 1000)) // +7 days
                );

                borrowedList.add(record);

                System.out.println("You have borrowed: " + item.getTitle());
                return;
            }
        }

        System.out.println("Book not found in the library.");
    }

    // returnBook(bookId : int) : void
    public static void returnBook(int bookId) {
        for (BorrowedBooks record : borrowedList) {
            if (record.bookId == bookId && record.status.equals("BORROWED")) {

                record.status = "RETURNED";
                record.returnDate = new Date();

                // Set the corresponding LibraryItems object as available again
                for (LibraryItemss item : LibraryItemss.libraryItemsList) {
                    if (item.getId() == bookId) {
                        item.setAvailability(true);
                        break;
                    }
                }

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("This book is not currently borrowed.");
    }

    // displayBorrowedBooks() : void
    public static void displayBorrowedBooks() {
        if (borrowedList.isEmpty()) {
            System.out.println("No borrowed books.");
            return;
        }

        System.out.println("Borrowed Books:");
        for (BorrowedBooks record : borrowedList) {
            System.out.println(
                    "Borrow ID: " + record.borrowId +
                    ", User ID: " + record.userId +
                    ", Book ID: " + record.bookId +
                    ", Status: " + record.status +
                    ", Borrow Date: " + record.borrowDate +
                    ", Due Date: " + record.returnDueDate +
                    (record.returnDate != null ? ", Return Date: " + record.returnDate : "")
            );
        }
    }
}


