package basics.oop.constructor;

class Book {
    String title;
    String author;

    Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    void printDetails() {
        System.out.println(title + " by " + author); // Added space before "by"
    }
}

public class BookConstructor {
    public static void main(String[] args) {
        Book myBook = new Book("Software Developer", "Punith");
        myBook.printDetails(); // Added this line to actually print the details
    }
}
