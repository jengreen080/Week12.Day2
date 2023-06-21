package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;
    private int capacity;

    public Library(ArrayList<Book> library){
        this.library = library;
//        this.library = new ArrayList<>();
        this.capacity = 10;
    }

    public int getNumberOfBooksInLibrary(){
        return library.size();
    }

    public void addBook(Book bookToAdd){
        library.add(bookToAdd);
    }

    public void addBookIfLibraryAtLessThanCapacity(Book bookToAdd){
        if (getNumberOfBooksInLibrary() < capacity){
            library.add(bookToAdd);
        }

    }
}
