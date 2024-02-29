import com.javaSprintOne.*;
//import jdk.jshell.Snippet;
//import org.w3c.dom.ls.LSOutput;

//import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        // System Intro
        System.out.println("|*******************************************|");
        System.out.println("| Welcome to the Library Management System! |");
        System.out.println("|*******************************************|" + "\n");



        // creating new authors 
        Author jamesDean = new Author("James Dean", "1978/07/08");
        jamesDean.setAuthorName("Kimberly Dean");// editing Author

        Author EricCarle = new Author("Eric Carle", "1983/011/23");
        Author harperLee = new Author("Harper Lee", "1926/04/28");
        Author georgeOrwell = new Author("George Orwell", "1903/06/25");
        Author scottFitzgerald = new Author("F. Scott Fitzgerald", "1896/09/24");
        Author jdSalinger = new Author("J.D. Salinger", "1919/01/01");
        Author jrrTolkien = new Author("J.R.R. Tolkien", "1892/01/03");
        Author hermanMelville = new Author("Herman Melville", "1819/08/01");

        // creating 10 Book objects with different records
        Book book1 = new Book("Pete The Cat", jamesDean, "9780062110695", "HarperCollins", 10);
        Book book2 = new Book("The Very Hungry Caterpillar", EricCarle, "9708399226908", "Philomel Books", 10);
        Book book3 = new Book("The Very Busy Spider", EricCarle, "9780399211667", "Philomel Books", 8);
        book3.setISBN("9780399200117"); // editing book ISBN
        book3.setBookPublisher("The Book Print"); //editing Book publisher

        Book book4 = new Book("To Kill a Mockingbird", harperLee, "9780061120084", "Harper Perennial Modern Classics", 8);
        Book book5 = new Book("1984", georgeOrwell, "9780451524935", "Signet Classics", 6);
        Book book6 = new Book("The Great Gatsby", scottFitzgerald, "9780743273565", "Scribner", 7);
        Book book7 = new Book("The Catcher in the Rye", jdSalinger, "9780316769488", "Back Bay Books", 4);
        Book book8 = new Book("The Hobbit", jrrTolkien, "9780547928227", "Houghton Mifflin Harcourt", 9);
        Book book9 = new Book("Moby Dick", hermanMelville, "9781853260087", "Wordsworth Editions", 3);
        Book book10 = new Book("The Lord of the Rings", jrrTolkien, "9780544003415", "Mariner Books", 10);

        // setting status types for book based on borrowed or not borrowed by patrons
        book1.setType(StatusType.CHECKED_OUT);
        book2.setType(StatusType.OVERDUE);
        book3.setType(StatusType.AVAILABLE);

         // adding books to Author writtenBooks array
        jamesDean.addAuthorBooks(book1);
        EricCarle.addAuthorBooks(book2);
        EricCarle.addAuthorBooks(book3);
        harperLee.addAuthorBooks(book4);
        georgeOrwell.addAuthorBooks(book5);
        scottFitzgerald.addAuthorBooks(book6);
        jdSalinger.addAuthorBooks(book7);
        jrrTolkien.addAuthorBooks(book8);
        hermanMelville.addAuthorBooks(book9);
        jrrTolkien.addAuthorBooks(book10);
        

        // delete book from author writtenBooks array
        //EricCarle.deleteAuthorBooks(book2);


        // printing out the writtenBooks array by author
        System.out.println("Books written by author: " + " " + EricCarle.getWrittenBooks() + "\n");

        // creating new patrons 
        Patron newPatron1 = new Patron();
        newPatron1.setFirstLastName("John Limon");
        newPatron1.setAddress("Address: 2 Holden St. Mt Pearl");
        newPatron1.setPhoneNum("Phone Number: 7091234567");


        Patron newPatron2 = new Patron();
        newPatron2.setFirstLastName("Jhailla Limon");
        newPatron2.setAddress("Address: 143 Topsail Rd St. John's NL");
        newPatron2.setPhoneNum("Phone Number: 7099876543");


        Patron newPatron3 = new Patron();
        newPatron3.setFirstLastName("Jhaille Limon");
        newPatron3.setAddress("Address: 12 Kenmount Rd St. John's NL");
        newPatron3.setPhoneNum("Phone Number: 7091437865");

        // editing patrons
        newPatron3.setFirstLastName("Name: Jhann Limon");



        // Testing library management system
        Library library = new Library();

        // adding books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // adding authors
        library.addAuthor(jamesDean);
        library.addAuthor(EricCarle);

        // adding patrons
        library.addPatron(newPatron1);
        library.addPatron(newPatron2);
        library.addPatron(newPatron3);




        // searching library search for book by author, ISBN, title
        System.out.println("Book Searched:");
        System.out.println(library.searchBooks("The Notebook")); // returns empty ArrayList because book doesn't exist
        System.out.println(library.searchBooks("Eric Carle")); // return two books The Very hungry Caterpillar and The Very Busy Spider
        System.out.println(library.searchBooks("9780062110695")); // return Pete The Cat
        System.out.println(library.searchBooks("The Very Hungry Caterpillar")); // return by book name search parameters

        System.out.println("\n");


        // testing borrow and return

        // borrow newPatron1
        System.out.println("Patron borrowing Book:");
        System.out.println("Available copies: " + " " + book1.getNumberOfCopies());
        library.borrowBook(book1, newPatron1, 2);
        System.out.println("Available copies now: " + " " + book1.getNumberOfCopies());
        System.out.println("Borrowed book(s) is:"+ " " + newPatron1.getBorrowedbooks() );
        System.out.println("\n");

        // return newPatron1
        System.out.println("Patron returning Book:");
        System.out.println("Available copies: " + " " + book1.getNumberOfCopies());
        library.returnBook(book1, newPatron1,2);
        System.out.println("Available number copies after return: " + " " + book1.getNumberOfCopies());
        System.out.println("\n");

        // borrow newPatron2
        System.out.println("Patron borrowing Book:");
        System.out.println("Available copies: " + " " + book2.getNumberOfCopies());
        library.borrowBook(book2, newPatron2, 1);
        System.out.println("Available copies now: " + " " + book2.getNumberOfCopies());
        System.out.println("Borrowed book(s) is:"+ " " + newPatron2.getBorrowedbooks() );
        System.out.println("\n");

        // return newPatron2
        System.out.println("Patron returning Book:");
        System.out.println("Available copies: " + " " + book2.getNumberOfCopies());
        library.returnBook(book2, newPatron2,1);
        System.out.println("Available number copies after return: " + " " + book2.getNumberOfCopies());
        System.out.println("\n");
    }
}