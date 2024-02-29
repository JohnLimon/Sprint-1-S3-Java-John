package com.javaSprintOne;

import java.util.ArrayList;


public class Patron {

    private String firstLastName;
    private String address;
    private String phoneNum;
    private ArrayList<Book> borrowedbooks;


    public Patron(){
        this.borrowedbooks = new ArrayList<Book>();
    }
    
    
    public ArrayList<Book> getBorrowedbooks() {
      return this.borrowedbooks;
    }


    public void addBorrowedBooks(Book book){
        this.borrowedbooks.add(book);
}


    public void removeBorrowedBook(Book book){
        this.borrowedbooks.remove(book);
    }

   
    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    @Override
    public String toString() {
        return "Patron{" +
                "firstLastName='" + firstLastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", borrowedbooks=" + borrowedbooks +
                '}';
    }

}




