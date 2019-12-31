package bookstoreproject;

public class BookStoreProject {

    public static void main(String[] args) {

        BookStore myStore = new BookStore("Highland road, LSU, 70808", "LSU Book Store");

        myStore.addBook(new Book("Bad Blood: Secrets and Lies in a Silicon Valley Startup", "John Carreyrou", 1, 12.97));
        myStore.addBook(new Book("The Hundred-Page Machine Learning Book", "Andriy Burkov", 1, 30.54));
        myStore.addBook(new Book("The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography", "Simon Singh", 1, 13.60));
        myStore.addBook(new Book("Don't Make Me Think, Revisited: A Common Sense Approach to Web Usability", "Steve Krug", 3, 31.33));
        myStore.addBook(new Book("Hooked: How to Build Habit-Forming Products", "Nir Eyal and Dave Wright", 1, 18.36));

        myStore.listBooks();
        myStore.sortBooks();
        myStore.listBooks();
    }//The main Method the program runs containing data from the user.

}
