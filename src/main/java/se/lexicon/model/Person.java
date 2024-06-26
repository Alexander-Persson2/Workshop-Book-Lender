package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    // todo: needs completion
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> booksLoaned;


    public Person(String firstName, String lastName)
    {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksLoaned = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<Book> getBooksLoaned() {
        return booksLoaned;
    }
    public static int getNextId() {
        return ++sequencer;
    }
    public void loanBook(Book book) {
        if (book.isAvailable()) {
            booksLoaned.add(book);
            book.setBorrower(this);
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" is already borrowed by " + book.getBorrower().getFirstName() + " " + book.getBorrower().getLastName());

        }
    }

    public void returnBook(Book book) {
        if (booksLoaned.contains(book)) {
            booksLoaned.remove(book);
            book.setBorrower(null);
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book is not borrowed by " + getFirstName() + " " + getLastName());
        }
    }

    public String getPersonInformation() {
        if (booksLoaned.isEmpty()) {
            return "Person{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", booksLoaned=None" +
                    '}';
        }
        StringBuilder borrowedBooks = new StringBuilder();
        for (Book book : booksLoaned) {
            borrowedBooks.append(book.getTitle()).append(", ");
        }

        String borrowedBooksStr = borrowedBooks.substring(0, borrowedBooks.length() -2);

        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", booksLoaned=[" + borrowedBooksStr +
                "]}";
    }

}