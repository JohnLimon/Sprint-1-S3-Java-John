package com.javaSprintOne;

import java.util.ArrayList;

public class Author {
    private String authorName;
    private String DOB;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", writtenBooks=" + writtenBooks +
                ", authorBooks='" + authorBooks + '\'' +
                '}';
    }

    public ArrayList<Book>  writtenBooks;


    public Author(String authorName, String DOB){
        this.authorName = authorName;
        this.DOB = DOB;
        this.writtenBooks = new ArrayList<>();

    }



    public ArrayList<Book> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(ArrayList<Book> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
    public void addAuthorBooks(Book book){
        this.writtenBooks.add(book);
    }
    public void deleteAuthorBooks(Book book){
        this.writtenBooks.remove(book);
    }


    private String authorBooks;
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }






}

