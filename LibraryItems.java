/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ja454
 */
import java.util.ArrayList;

public class LibraryItems {
    private int Id;
    private String Title;
    private String Author;
    private double Price;
    private String Genre;
    private String type;
    private boolean availability;
    public static ArrayList<LibraryItems> libraryItemsList = new ArrayList<>();

    public LibraryItems(int Id, String Title, String Author, double Price, String Genre, String type) {
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

    public static LibraryItems findBookById(int bookID) {
        for (LibraryItems book : libraryItemsList) {
            if (book.getId() == bookID) {
                return book;
            }
        }
        return null;
    }

    public static LibraryItems findBookByTitle(String title) {
        for (LibraryItems book : libraryItemsList) {
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

class EBook extends LibraryItems {
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


