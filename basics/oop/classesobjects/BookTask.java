package basics.oop.classesobjects;


class Book{
    String title;
    String author;
    int pages;
}

public class BookTask{
    public static void main(String[] args){
        Book myBook = new Book();
        myBook.title = "Beyond Entrprenurship";
        myBook.author = "Jim";
        myBook.pages = 200;

        System.err.println("Title:" + myBook.title);
        System.err.println("Author:" + myBook.author);
        System.err.println("Pages:" + myBook.pages);
        
    }
}
