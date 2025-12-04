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
public class LibraryItems {
      private int Id;
    private String  Title ;
    private String Author ;
    private double Price;
    private String Genre;
    private String type;
    public static ArrayList<LibraryItems> libraryItemsList = new ArrayList<>();
    private boolean availability;
       
    public LibraryItems(int Id, String Title, String author, double price, String Genre,String type) {
        this.Id = Id;
        this.Title = Title;
        this.Author = author;
        this.Price = price;
        this.Genre = Genre;
        this.type=type;
        this.availability = true;
      
    }
        
    public int getId() {
        return Id;
    }

    public void setid(int Id) {
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

    public void setAuthor(String author) {
        this.Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
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
    public void setAvailability(boolean aAvailability) { 
            availability = aAvailability;
        }
    public  boolean isAvailability() { 
        return availability;
    }

 public boolean bookAvailability(String bookName) {
 
      boolean found = false;
        for (LibraryItems item : libraryItemsList) {
            if (item.getTitle().equalsIgnoreCase(bookName)) {
                System.out.println("Match for '" + bookName + "' was found.");             
                item.setAvailability(true); 
                found = true;
                return true;
            }
        }
         if(!found){
             System.out.println("Match for "+"''"+bookName+"''"+" was not find, Book is not available"); 
             
         }
         return false;
 }
 public static LibraryItems findBookById(int bookID) {
        for (LibraryItems book : libraryItemsList) {
            if (book.getId() == bookID) {
                return book;  // Return the book if found
            }
        }
        return null;  // Return null if no book is found 
    }
public static LibraryItems findBookByTitle(String title) {
        for (LibraryItems book : libraryItemsList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Return the book 
            }
        }
        return null; // Return null if not found
    }

    @Override
    public String toString() {
        return  "[ "+type+" Title=" + Title + ",Author=" + Author + " ,Price=" + Price + 
               " ,Availability=" + (isAvailability() ? "Available" : "Not Available") + ",Genre=" + Genre;}

}


class Book extends LibraryItems {
    private int printYear;
    private String language;

    public Book(int id, String title, String author, double price, String genre, String type, int printYear, String language) {
        super(id, title, author, price, genre, type);
        this.printYear = printYear;
        this.language = language;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", print Year: " + printYear +
                ", Language: " + language+" ]";
    }
}

// Subclass for eBooks
class EBook extends LibraryItems {
    private String fileFormat;
    private int publishYear;
    private String language;
    private int pages;

    public EBook(int id, String title, String author, double price, String genre, 
            String type, String fileFormat, int publishYear, String language, int pages) {
        super(id, title, author, price, genre, type);
        this.fileFormat = fileFormat;
        this.publishYear = publishYear;
        this.language = language;
        this.pages = pages;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", File Format: " + fileFormat +
                ", Publish Year: " + publishYear +
                ", Language: " + language +
                ", Pages: " + pages+" ]";
    }
}
class BorrowedBooks extends LibraryItems {
    private static ArrayList<LibraryItems> borrowedBooksList = new ArrayList<>();

    BorrowedBooks(int Id, String Title, String Author, double Price, String Genre, String type) {
        super(Id, Title, Author, Price, Genre, type); 
    }

    public static void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book you want to borrow: ");
        String bookTitle = scanner.nextLine();

        // Check if the book is available in the library
        for (LibraryItems book : LibraryItems.libraryItemsList) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                if (book.isAvailability()) {
                    book.setAvailability(false); // Mark as borrowed
                    borrowedBooksList.add(book); // Add to borrowed list
                    System.out.println("You have successfully borrowed \"" + book.getTitle() + "\".");
                    return;
                } else {
                    System.out.println("Sorry, \"" + book.getTitle() + "\" is already borrowed.");
                    return;
                }
            }
        }

        System.out.println("Sorry, the book \"" + bookTitle + "\" is not in our library.");
    }

    public static void displayBorrowedBooks() {
        if (borrowedBooksList.isEmpty()) {
            System.out.println("No books have been borrowed yet.");
        } else {
            System.out.println("Borrowed Books:");
            for (LibraryItems book : borrowedBooksList) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }}


