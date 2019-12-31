package bookstoreproject;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {

    private String address;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public BookStore() {
    }//Default constructor for "BookStore"

    public BookStore(String address, String name) {
        this.address = address;
        this.name = name;
    }//Constructor sets values of a few data members.

    public void addBook(Book book) {
        books.add(book);
    }//used to add a book to the Book ArrayList

    public void sortBooks() {
        Collections.sort(books);
    }//Called when sorting the books based off titles.

    public void listBooks() {
        System.out.printf("%-15s%-15s%-10s%-10s", "Title", "Author", "edition", "price \n");
        System.out.println("--------------------------------------------------");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println("--------------------------------------------------");
    }//Prints out data books have and formats it in a readable way.

}//This is the class that lets us know what store we are using.
