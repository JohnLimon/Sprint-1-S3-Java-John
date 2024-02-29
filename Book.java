package com.javaSprintOne;

//import java.util.ArrayList;


public class Book implements Borrowable {

    public StatusType getType() {
        return type;
    }
    private StatusType type;
    public String bookTitle;
    public String bookAuthor;

    // ISBN is book serial number
    public String ISBN;
    public String bookPublisher;
    public int numberOfCopies;

    public Book(String bookTitle, Author authorName, String ISBN, String bookPublisher, int numberOfCopies){
        this.bookTitle = bookTitle;

        this.bookAuthor =  authorName.getAuthorName();; // need help
        this.ISBN = ISBN;
        this.bookPublisher = bookPublisher;
        this.numberOfCopies = numberOfCopies;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public Book(){
        // empty constructor
    }

// compile book constructor


    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }

    public void setType(StatusType type) {
        this.type = type;
    }

    @Override
    public void borrowBook(Book book, Patron patron, int QTY) {

    }

    @Override
    public void returnBook(Book book, Patron patron, int QTY) {

    }
}
