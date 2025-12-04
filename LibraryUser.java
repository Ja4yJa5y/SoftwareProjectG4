/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryUser {
   protected String id;  
    protected Scanner scanner;  
      

    public LibraryUser(String id,Scanner scanner) {  

        this.id = id; 
        this.scanner=scanner;
        
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id=id;
    }
}
    
    class Managment extends LibraryUser{
   
     public Managment(String id,Scanner scanner) {
        super(id,scanner);
        
     }
        protected void addBook() {  
        
        System.out.print("Are you adding a regular book or an e-book? (Enter 'book' or 'ebook'): ");  

        String entry = scanner.nextLine().trim().toLowerCase();  
        
  
        System.out.println("Enter Book ID: ");  

        int id = scanner.nextInt(); 
        for (LibraryItems i : LibraryItems.libraryItemsList) {
            if (i.getId() == id){
            System.out.println("\n================================"); 
            System.out.println("|   Can not be added ID already exist!! |");  
            System.out.println(" ==================================");  
            addBook();
            } }

        System.out.println("Enter Title: ");  

        String title = scanner.nextLine();  
        scanner.nextLine();

        System.out.println("Enter Author: ");  

        String author = scanner.nextLine(); 
        scanner.nextLine();

        System.out.print("Enter Price: ");  

        double price = scanner.nextDouble();  

        scanner.nextLine();  

        System.out.print("Enter Genre: ");  

        String genre = scanner.nextLine();  

        System.out.print("Enter the type of the book: ");
        String type = scanner.nextLine();
        
        System.out.print("Enter the language: ");
        String language=scanner.nextLine();

        if ("ebook".equals(entry)) {  

            System.out.print("Enter file format (e.g., PDF, EPUB): ");  

            String fileFormat = scanner.nextLine();
             System.out.print("Enter the publish Year: ");  

            int publishYear = scanner.nextInt();
            
            System.out.print("Enter the number of pages: ");
            int pages=scanner.nextInt();
            
            EBook newEbook = new EBook(id, title, author, price, genre, type, fileFormat,publishYear,language,pages);  

            LibraryItems.libraryItemsList.add(newEbook);  

            System.out.println("E-book added: " + title); 
            newEbook.toString();

        } else if (("book".equals(entry))) {  
            

            System.out.print("Enter pint year: ");  

            int printyear = scanner.nextInt();  

            Book newBook = new Book(id, title,  author, price, genre,  type,  printyear, language);  

            LibraryItems.libraryItemsList.add(newBook);  

            System.out.println("Book added: " + title);  
            newBook.toString();

        } else {  

            System.out.println("Invalid type. Please enter 'book' or 'ebook'.");  

        }  

    }  


    // Delete a book from the library  

    protected void deleteBook() {  

        System.out.print("Enter Book ID to delete: ");  

        int id =scanner.nextInt();  
        boolean found = false;  
        for (int i = 0; i < LibraryItems.libraryItemsList.size(); i++) {
    if (LibraryItems.libraryItemsList.get(i).getId()==id) { 
        System.out.println("Book: " +LibraryItems.libraryItemsList.get(i).getTitle() );

        LibraryItems.libraryItemsList.remove(i);
        System.out.println("Book Removed ");
        found = true; 
        
        break; // Exit loop after removal
    }
     
}  
        if (!found) {
    System.out.println("Book not found!");
}
    }      
      

    //  method to update a book  

protected void updateBookDetails() {
        System.out.print("Enter the Book ID to update: ");
        int id =scanner.nextInt();
        
        // Search for the book in the library
        LibraryItems bookToUpdate = null;
        for (LibraryItems item : LibraryItems.libraryItemsList) {
            if (item.getId() == id) {
                bookToUpdate = item;
                break;
            }
        }

        if (bookToUpdate == null) {
            System.out.println("Book with ID " + id + " not found.");
            return; // Exit if book is not found
        }

        
        System.out.print("Do you want to update the price or availability? (Enter 'price' or 'availability'): ");
        String updateChoice = scanner.next().trim().toLowerCase();
        scanner.nextLine();

        if ("price".equals(updateChoice)) {
            System.out.print("Enter the new price: ");
            double newprice = scanner.nextDouble();
            bookToUpdate.setPrice(newprice);  
            System.out.println("Price updated to: " + newprice);
        } else if ("availability".equals(updateChoice)) {
            System.out.print("Enter the new availability: ");
            boolean newavailable = scanner.nextBoolean();
            bookToUpdate.setAvailability(newavailable);  
            System.out.println("Availability updated to: " + newavailable);
        } else {
            System.out.println("Invalid choice. Please enter 'price' or 'availability'.");
        }
    }
   }  
class Manager extends Managment {  
     public Manager(String id,Scanner scanner) {
        super(id,scanner);
    }

    private void viewProfit(double revenue, double expenses) {  

        double profit = revenue - expenses;  


        System.out.println("Total Profit: SAR" + profit);  

 

    }  
   

      
    protected void Mwindow() {  

        boolean enableMenu = true;  

        while (enableMenu) {  

           System.out.println("\n================================"); 
            System.out.println("|       Manager Menu             |"); 
            System.out.println(" =================================="); 
            System.out.println("1. Add Book"); 
            System.out.println("2. Delete Book"); 
            System.out.println("3. Update Book");
            System.out.println("4. View Profit");
            System.out.println("5. Return"); 
 
            System.out.print("Enter your choice (1-5): "); 
//
            String choice = scanner.next();
            scanner.nextLine(); 

            switch (choice) {  

                case "1":  

                    addBook();  

                    break;  

                case "2":  

                    deleteBook();  

                    break;  

                case "3":  

                    updateBookDetails();  

                    break;  

                case "4":  

                    System.out.print("Enter total revenue: ");  

                    double revenue = scanner.nextDouble();  

                    System.out.print("Enter total expenses: ");  

                    double expenses = scanner.nextDouble();  

                    scanner.nextLine();   

                    viewProfit(revenue, expenses);  

                    break;  

                case "5":  

                    enableMenu = false; // Exit the menu  

                    break;  

                default:  

                    System.out.println("Invalid option. Please try again.");  

            }  

        }
    }
}
class Employee extends Managment {  
    public Employee(String id,Scanner scanner) {
        super(id,scanner);
    }

protected void Ewindow() {  

        boolean enableMenu = true;  

        while (enableMenu) {  

           System.out.println("\n================================"); 
            System.out.println("|       Employee Menu              |"); 
            System.out.println(" =================================="); 
            System.out.println("1. Add Book"); 
            System.out.println("2. Delete Book"); 
            System.out.println("3. Update Book"); 
            System.out.println("4. Return"); 
 
            System.out.print("Enter your choice (1-4): "); 
  

            String choice = scanner.next();
            scanner.nextLine(); 
  

            switch (choice) {  

                case "1":  

                    addBook();  

                    break;  

                case "2":  

                    deleteBook();  

                    break;  

                case "3":  

                    updateBookDetails();  

                    break;  

                case "4":  

                    enableMenu = false; // Exit the menu  

                    break;  

                default:  

                    System.out.println("Invalid option. Please try again.");  

            }  

        }  

    }  

}
class Customers extends LibraryUser {
    Cart cart;
    
    public Customers(String userID,Scanner scanner) {
        super(userID,scanner);  
        cart = new Cart();  // Initialize a new cart for each customer
    }

    // Method to check availability of a book by its ID
  public void checkAvailability(String bookTitle) {
    LibraryItems book = LibraryItems.findBookByTitle(bookTitle); // Find the book by title
    if (book != null) {
        if (book.isAvailability()) {
            System.out.println("The book '" + book.getTitle() + "' is available.");
        } else {
            System.out.println("The book '" + book.getTitle() + "' is currently unavailable.");
        }
    } else {
        System.out.println("No book found with the title '" + bookTitle + "'.");
    }
}


    // Method to view all books in the library
  public void viewBooks() {
        System.out.println("All books in the library:");
        for (LibraryItems book : LibraryItems.libraryItemsList) {
            System.out.println(book); // Print all books regardless of availability
        }
    }
  public void searchBook(String title) { 
    boolean found = false; 
    for (LibraryItems book : LibraryItems.libraryItemsList) { 
        if (book.getTitle().equalsIgnoreCase(title)) { // Compare the title (case-insensitive)
            System.out.println("Found book: " + book); // Print the book details
            found = true;
            break; // Exit the loop once the book is found
        }
        
    }if(!found){
            System.out.println("Book is not Available");
        }
  }

    // Method to search a book by ID
    public void searchBook(int bookID) {
        boolean found = false;
        for (LibraryItems book : LibraryItems.libraryItemsList) {
            if (book.getId() == bookID) {
                System.out.println("Found book: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }

    // Method to search books by genre
    public void searchBookByGenre(String genre) {
        boolean found = false;
        for (LibraryItems book : LibraryItems.libraryItemsList) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Found book: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the genre: " + genre);
        }
    }

    // Method to search books by author
    public static void searchByAuthor(String author) {
        boolean found = false;
        for (LibraryItems book : LibraryItems.libraryItemsList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Method to add a book to the cart by title
    public void addToCart() {
        Scanner scanner = new Scanner(System.in);

        // Ask the customer for the book title
        System.out.println("Enter the title of the book you want to add to your cart:");
        String bookTitle = scanner.nextLine();

        
        LibraryItems book = LibraryItems.findBookByTitle(bookTitle);

        if (book != null) {
            
            cart.addBook(book.getPrice());
            System.out.println("Added '" + book.getTitle() + "' to cart. Book price: SAR" + book.getPrice());
        } else {
            // error message if the book is not found
            System.out.println("Book not found in the library.");
        }
    }

    // Method to clear the cart
    public void clearCart() {
        cart.clearCart();
    }

public void checkout() {
    double totalAmount = cart.calculateTotal();
    if(totalAmount>0){
    System.out.println("Total amount to pay: SAR" + totalAmount);
    String paymentType = Payment.selectPaymentType(); // Select payment type
    boolean paymentResult = Payment.processPayment(totalAmount, paymentType); // Process the payment 

    
    if (!paymentResult) {
        System.out.println("Unable to complete the purchase.");
    } else {
        System.out.println("Purchase completed successfully!");
    }
}
    else
        System.out.println("unable to checkout.the book doesnt exist");

    }
}














