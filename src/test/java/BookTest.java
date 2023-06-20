import org.example.Book;
import org.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {
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
        ArrayList<Book> booksInTheLibrary = new ArrayList<>();
        booksInTheLibrary.add(book1);
        booksInTheLibrary.add(book2);
        booksInTheLibrary.add(book3);
        booksInTheLibrary.add(book4);
//        library = new Library(booksInTheLibrary);
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Life of Pi", book4.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Yann Martel", book4.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("fiction", book4.getGenre());
    }
}
