package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    private List<com.kodilla.testing.library.Book> generateListOfNBooks(int booksQuantity) {
        List<com.kodilla.testing.library.Book> resultList = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            com.kodilla.testing.library.Book theBook = new com.kodilla.testing.library.Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Mock
    private com.kodilla.testing.library.LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);
        List<com.kodilla.testing.library.Book> resultListOfBooks = new ArrayList<>();
        com.kodilla.testing.library.Book book1 = new com.kodilla.testing.library.Book("Secrets of Alamo", "John Smith", 2008);
        com.kodilla.testing.library.Book book2 = new com.kodilla.testing.library.Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        com.kodilla.testing.library.Book book3 = new com.kodilla.testing.library.Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        com.kodilla.testing.library.Book book4 = new com.kodilla.testing.library.Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<com.kodilla.testing.library.Book> theListoOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListoOfBooks.size());

    }
    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);
        List<com.kodilla.testing.library.Book> resultListOf0Books = new ArrayList<com.kodilla.testing.library.Book>();
        List<com.kodilla.testing.library.Book> resultListOf15Books = generateListOfNBooks(15);
        List<com.kodilla.testing.library.Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<com.kodilla.testing.library.Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        List<com.kodilla.testing.library.Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<com.kodilla.testing.library.Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");

        // Then
        assertEquals(0, theListOfBooks40.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks0.size());
    }
    @Test
    void testListBooksWithNoConditionFragmentShorterThan3() {

        // Given
        com.kodilla.testing.library.LibraryDatabase libraryDatabaseMock = mock(com.kodilla.testing.library.LibraryDatabase.class);
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);

        // When
        List<com.kodilla.testing.library.Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf5Books() {

        // Given
        com.kodilla.testing.library.LibraryDatabase libraryDatabaseMock = mock(com.kodilla.testing.library.LibraryDatabase.class);
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);
        List<com.kodilla.testing.library.Book> resultListOf5Book = generateListOfNBooks(5);
        com.kodilla.testing.library.LibraryUser user = new com.kodilla.testing.library.LibraryUser("John", "Smith", "12345678910");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf5Book);

        //When
        List<com.kodilla.testing.library.Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(5, theListOfBooks5.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListBooksInHandsOf1Books() {

        // Given
        com.kodilla.testing.library.LibraryDatabase libraryDatabaseMock = mock(com.kodilla.testing.library.LibraryDatabase.class);
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);
        List<com.kodilla.testing.library.Book> resultListOf1Book = generateListOfNBooks(1);
        com.kodilla.testing.library.LibraryUser user = new com.kodilla.testing.library.LibraryUser("John", "Smith", "98762000876");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf1Book);

        //When
        List<com.kodilla.testing.library.Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(1, theListOfBooks1.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListBooksInHandsOf0Books() {

        // Given
        com.kodilla.testing.library.LibraryDatabase libraryDatabaseMock = mock(com.kodilla.testing.library.LibraryDatabase.class);
        com.kodilla.testing.library.BookLibrary bookLibrary = new com.kodilla.testing.library.BookLibrary(libraryDatabaseMock);
        List<com.kodilla.testing.library.Book> resultListOf0Book = new ArrayList<>();
        com.kodilla.testing.library.LibraryUser user = new com.kodilla.testing.library.LibraryUser("John", "Smith", "98762000876");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf0Book);

        //When
        List<com.kodilla.testing.library.Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(0, theListOfBooks0.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }
}
