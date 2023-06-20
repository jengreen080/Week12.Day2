package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library(ArrayList<Book> listOfBooks){
        this.library = listOfBooks;
    }

    public int getNumberOfBooksInLibrary(){
        return library.size();
    }

    public void addBook(Book bookToAdd){
        library.add(bookToAdd);
    }
}
