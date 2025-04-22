package basics.oop.staticandinstance;


class Book{
    private String title;
    private String author;

    // Static field to count total books
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        // Increment totalBooks when a new Book is created
        totalBooks++;
    }

    // Static method to get total book count
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Other methods (optional)
    public void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
public class staticandinstance {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Brave New World", "Aldous Huxley");
        Book b3 = new Book("Fahrenheit 451", "Ray Bradbury");

        System.out.println("Total books created: " + Book.getTotalBooks());
    }
}