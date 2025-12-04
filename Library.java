/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author Ja454
 */

import java.util.Scanner;


public class Library {

    private static final String MANAGER_ID = "111"; 
    private static final String EMPLOYEE_ID = "222"; 
    static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) { 
        // Predefined library items
        Book.libraryItemsList.add(new Book(1, "Harry Potter and the half-blood prince", "J.K Rowling", 49.9, "Children Books", "Novel", 2005, "English"));
        Book.libraryItemsList.add(new Book(2, "نوادر إدارية", "راسل قاسم", 46, "Business & Mangment", "Book", 2021, "Arabic"));
        Book.libraryItemsList.add(new Book(3, "Hospital and Home", "Ian Peate", 199, "Medical Books", "Book", 2024, "English"));
        Book.libraryItemsList.add(new Book(4, "رحلة وطن", "لينه السليماني", 18, "Children Books", "Book", 2024, "Arabic"));
        Book.libraryItemsList.add(new Book(5, "Think Again", "Adam Grant", 69, "Self Development", "Book", 2022, "English"));
        Book.libraryItemsList.add(new Book(6, "To Kill a Mockingbird", "Harper Lee", 10.99, "Fiction", "Novel", 1960, "English"));
        Book.libraryItemsList.add(new Book(7, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 20.99, "Fantasy", "Novel", 1997, "English"));
        Book.libraryItemsList.add(new Book(8, "Nature Neuroscience", "Editorial Board", 25.00, "Science", "Journal", 2024, "English"));
        Book.libraryItemsList.add(new Book(9, "Journal of Artificial Intelligence Research", "Editorial Board", 30.00, "Technology", "Journal", 2023, "English"));
        Book.libraryItemsList.add(new Book(10, "PLOS Medicine", "Editorial Board", 22.00, "Medical", "Journal", 2024, "English"));
        Book.libraryItemsList.add(new Book(11, "National Geographic", "Various Authors", 5.99, "Science", "Magazine", 2024, "English"));
        Book.libraryItemsList.add(new Book(12, "Introduction to Algorithms", "Thomas H. Cormen", 89.99, "Education", "Textbook", 2009, "English"));
        Book.libraryItemsList.add(new Book(13, "Organic Chemistry", "Paula Yurkanis Bruice", 95.99, "Education", "Textbook", 2020, "English"));
        EBook.libraryItemsList.add(new EBook(14, "Clean Code", "Robert C. Martin", 19.99, "Programming", "E-book", "PDF", 2008, "English", 464));
        EBook.libraryItemsList.add(new EBook(15, "The Pragmatic Programmer", "Andrew Hunt & David Thomas", 18.99, "Programming", "E-book", "EPUB", 1999, "English", 352));
        EBook.libraryItemsList.add(new EBook(16, "Becoming", "Michelle Obama", 14.99, "Biography", "E-book", "Kindle", 2018, "English", 448));
        EBook.libraryItemsList.add(new EBook(17, "Atomic Habits", "James Clear", 11.99, "Self-Help", "E-book", "PDF", 2018, "English", 320));
        EBook.libraryItemsList.add(new EBook(18, "1984", "George Orwell", 9.99, "Fiction", "E-book", "EPUB", 1949, "English", 328));
        EBook.libraryItemsList.add(new EBook(19, "A Brief History of Time", "Stephen Hawking", 15.99, "Science", "E-book", "MOBI", 1988, "English", 212));
        EBook.libraryItemsList.add(new EBook(20, "Artificial Intelligence: A Guide to Intelligent Systems", "Michael Negnevitsky", 39.99, "Technology", "E-book", "PDF", 2020, "English", 504));
        EBook.libraryItemsList.add(new EBook(21, "The Great Gatsby", "F. Scott Fitzgerald", 7.99, "Fiction", "E-book", "EPUB", 1925, "English", 180));
        EBook.libraryItemsList.add(new EBook(22, "Pride and Prejudice", "Jane Austen", 6.99, "Romance", "E-book", "PDF", 1813, "English", 279));
        EBook.libraryItemsList.add(new EBook(23, "Dune", "Frank Herbert", 12.99, "Science Fiction", "E-book", "Kindle", 1965, "English", 412));
        EBook.libraryItemsList.add(new EBook(24, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 7.99, "Fantasy", "E-book", "Kindle", 1997, "English", 309));
      

        
        printWelcome();
        start();
    }
        public static void start(){
         System.out.print("Please choose an option:\n[1] Manage\n[2] Shop\n[3] Exit\nEnter your choice (1 or 2 or 3): ");
        String choice = scanner.nextLine().trim();  

        if ("2".equals(choice)) { 
            showShoppingMenu(scanner);
           
        } else if ("1".equals(choice)) {
            
            manageAccess(scanner);  
        } else if("3".equals(choice)) { 
            return;
        }
        else{
            printError("Invalid choice. Please enter '1' for Manage or '2' for Shop.'3' to Exit");
        }
    }

    private static void printWelcome() { 
        System.out.println(" ==================================="); 
        System.out.println("|    Welcome to Digital Library!    |"); 
        System.out.println(" ===================================");
    }

    private static void showShoppingMenu(Scanner scanner) { 
                Customers customer = new Customers("333",scanner);

        while (true) { 
            System.out.println("\n==================================");
            System.out.println("|           Shopping Menu           |");
            System.out.println(" ==================================");
            System.out.println("1. View Available Books"); 
            System.out.println("2. View a Book Info"); 
            System.out.println("3. Search for a Book"); 
            System.out.println("4. Borrow a Book"); 
            System.out.println("5. View Borrowed Books"); 
            System.out.println("6. Add a Book to Cart"); 
            System.out.println("7. Checkout"); 
            System.out.println("8. Return");

            System.out.print("Enter your choice (1-8): "); 
            String choice = scanner.nextLine().trim();

            switch (choice) { 
                case "1": 
                    customer.viewBooks(); 
                    break; 
                case "2": 
                    System.out.println("Enter the book title: "); 
                    String bookName = scanner.nextLine(); 
                    customer.searchBook(bookName); 
                    break; 
                case "3": 
                    System.out.println("Search by:  \n1:Author name\n2:Book title\n3:Genre\n4:ID"); 
                    int num = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (num == 1) { 
                        System.out.println("Enter the Author's name:"); 
                        String author = scanner.nextLine(); 
                        customer.searchByAuthor(author); 
                    } else if (num == 2) { 
                        System.out.println("Enter the Book's title:"); 
                        String bookN = scanner.nextLine(); 
                        customer.searchBook(bookN); 
                    } else if (num == 3) { 
                        System.out.println("Enter the Genre:"); 
                        String bookGenre = scanner.nextLine(); 
                        customer.searchBookByGenre(bookGenre); 
                    } else if (num == 4) { 
                        System.out.println("Enter the Book's ID:"); 
                        int bookID = scanner.nextInt(); 
                        customer.searchBook(bookID);
                        scanner.nextLine();
                    }
                    else { 
                        printError("Wrong entry! Please enter a number from (1-3)"); 
                    }
                    break; 
                case "4": 
                    BorrowedBooks.borrowBook(); 
                    break; 
                case "5": 
                    BorrowedBooks.displayBorrowedBooks(); 
                    break; 
                case "6": 
                    customer.addToCart(); 
                    break; 
                case "7": 
                    customer.checkout(); 
                    break; 
                case "8": 
                    System.out.println("Exiting shopping menu..."); 
                    start();
                    break; 
                default: 
                    printError("Invalid choice. Please enter a number between 1 and 8.");
            } 
        } 
    }
       private static void manageAccess(Scanner scanner) {
        System.out.print("Please enter your ID: ");
        String id = scanner.nextLine().trim();

        if (MANAGER_ID.equals(id)) {
            Manager manager = new Manager("111",scanner);  
            manager.Mwindow(); 
            start();
        } else if (EMPLOYEE_ID.equals(id)) {
            Employee employee = new Employee("222",scanner); 
            employee.Ewindow();
            start();
        } else {
            printError("Invalid ID. Access denied.");
        }
    }
    private static void printError(String message) { 
        System.out.println("\n ===========================================");
        System.out.println("|                ERROR                      |");
        System.out.println("|             " + message + "   |");
        System.out.println(" ===========================================");
    } 
}






