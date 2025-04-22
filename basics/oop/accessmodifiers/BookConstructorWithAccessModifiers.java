package basics.oop.accessmodifiers;

class Book {

    private String isbn;
    String title;
    String author;

    Book(String t, String a, String isbn) {
        this.title = t;
        this.author = a;
        this.isbn = isbn;
    }

    void printDetails() {
        System.out.println(title + "by" + author);
    }

    public String getIsbn() {
        return isbn;
    }
}
public class BookConstructorWithAccessModifiers {
    public static void main(String[] args){
        Book myBook = new Book("Software Developer", "Punith", "ISBN-12345");
        
        myBook.printDetails();
        
        // ✅ Correct way to access ISBN using getter
        System.out.println("ISBN (via getter): " + myBook.getIsbn());

        // ❌ Incorrect way: Direct access will fail (uncommenting this will cause a compile-time error)
        // System.out.println("ISBN (direct): " + myBook.isbn); // ❌ ERROR: isbn has private access in Book
    }
}