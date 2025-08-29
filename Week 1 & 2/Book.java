import java.util.Scanner;

public class Book {

//write your code here..
	// Attributes of the Book class
    private String title;
    private String author;
    private int pageCount;

    // Default constructor
    public Book() {
       // this.title = "Unknown Title";
        //this.author = "Unknown Author";
        this.pageCount = 666;
    }

    // Constructor with title and author parameters
    public Book(String title, String author) {
		this();
        this.title = title;
        this.author = author;
        //this.pageCount = 0;  // Default page count
    }

    // Constructor with title, author, and pageCount parameters
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for Book 1
        System.out.println("Details for Book 1:");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();

        // Creating Book 1 using the constructor with title and author parameters
        Book book1 = new Book(title1,author1);

        // Taking user inputs for Book 2
        System.out.println("Details for Book 2:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Page Count: ");
        int pageCount2 = scanner.nextInt();

        // Creating Book 2 using the constructor with all parameters
        Book book2 = new Book(title2, author2, pageCount2);

        // Displaying details of each book
		System.out.println("Displaying Books Details");
		System.out.println("_________________________");
        System.out.println("Book 1:");
        book1.displayBookDetails();
        System.out.println("_________________________");
        System.out.println("Book 2:");
        book2.displayBookDetails();

        // Close the scanner
        scanner.close();
    }
}
