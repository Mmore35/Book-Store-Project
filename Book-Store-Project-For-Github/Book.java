package bookstoreproject;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int edition;
    private double price;

    public Book() {
    }//Default constructor for "Book".

    public Book(String title, String author, int edition, double price) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }//Constructor to set datamembers for each Book.

    @Override
    public int compareTo(Book Other) {

        return this.title.compareTo(Other.title);

    }//used to sort the titles of the books.

    public String getInfo() {
        return String.format("%-15s%-15s%-10d%-10.6f", title.substring(0, 10), author.substring(0, 10), edition, price);
    } //gets the information about the book to be printed later.

}//Sorts and hold values of each book.
