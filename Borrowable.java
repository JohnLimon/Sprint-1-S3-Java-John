package com.javaSprintOne;
//import java.util.ArrayList;
//import java.util.List;

public interface Borrowable {
    /**
     * An interface that defines methods to borrow books and return book, the book class should implement this
     **/

  void borrowBook(Book book, Patron patron, int QTY);

  void returnBook(Book book, Patron patron, int QTY);

}
