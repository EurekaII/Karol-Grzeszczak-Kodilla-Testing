package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // lists books having title beginning with titleFragment
    List<com.kodilla.testing.library.Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    List<com.kodilla.testing.library.Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(com.kodilla.testing.library.LibraryUser libraryUser, com.kodilla.testing.library.Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned
    int returnBooks(com.kodilla.testing.library.LibraryUser libraryUser);
}