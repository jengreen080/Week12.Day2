import org.example.Book;
import org.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        book1 = new Book("Isaac and the Egg", "Bobby Palmer", "fiction");
        book2 = new Book("To Kill a Mockingbird", "Harper Lee", "fiction");
        book3 = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", "science-fiction");
        book4 = new Book("Life of Pi", "Yann Martel", "fiction");
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        library = new Library(listOfBooks);
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(4, library.getNumberOfBooksInLibrary());
    }

    @Test
    public void canAddBook(){
        library.addBook(new Book("Pachinko", "Min Jin Lee", "fiction"));
        assertEquals(5, library.getNumberOfBooksInLibrary());
    }

    @Test
    public void canAddBookIfLibraryAtLessThanCapacity(){
        library.addBookIfLibraryAtLessThanCapacity(new Book("Pachinko", "Min Jin Lee", "fiction"));
        assertEquals(5, library.getNumberOfBooksInLibrary());
    }
    @Test
    public void canNotAddBookIfLibraryAtCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book4);
        library.addBook(book2);
        library.addBookIfLibraryAtLessThanCapacity(new Book("Pachinko", "Min Jin Lee", "fiction"));
        assertEquals(10, library.getNumberOfBooksInLibrary());
    }
}
