public class Book 
{
    // Attributes
    private String title;
    private double price;
    private String author;
    private String email;
    private String nationality;

    // Constructor
    public Book(String title, double price, String author, String email, String nationality) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.email = email;
        this.nationality = nationality;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getEmail() {
        return email;
    }

    public String getNationality() {
        return nationality;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("Harry Potter and the Philosopher's Stone", 19.99, "J.K. Rowling", "jk.rowling@example.com", "British");

        // Printing book details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Email: " + book.getEmail());
        System.out.println("Nationality: " + book.getNationality());
    }
}