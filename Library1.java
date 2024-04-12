package Classroom3;     //Que 8
import java.util.ArrayList;

import java.util.Iterator;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println(title + " has been removed from the library.");
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found in the library.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class Library1 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Core java", "James Gosling ");
        Book book2 = new Book("c++", "Bjarne Stroustrup");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook("Core java");

        library.displayBooks();
    }
}
