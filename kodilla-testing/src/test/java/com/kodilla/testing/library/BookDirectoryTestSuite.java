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
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListoOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListoOfBooks.size());

    }
    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");

        // Then
        assertEquals(0, theListOfBooks40.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks0.size());
    }
    @Test
    void testListBooksWithNoConditionFragmentShorterThan3() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf5Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Book = generateListOfNBooks(5);
        LibraryUser user = new LibraryUser("John", "Smith", "12345678910");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf5Book);

        //When
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(5, theListOfBooks5.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListBooksInHandsOf1Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        LibraryUser user = new LibraryUser("John", "Smith", "98762000876");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf1Book);

        //When
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(1, theListOfBooks1.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListBooksInHandsOf0Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Book = new ArrayList<>();
        LibraryUser user = new LibraryUser("John", "Smith", "98762000876");
        when(libraryDatabaseMock.listBooksInHandsOf(user))
                .thenReturn(resultListOf0Book);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(0, theListOfBooks0.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }
}
