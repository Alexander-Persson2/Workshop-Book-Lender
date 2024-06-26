package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance

        Book book1 = new Book("Harry Potter & The Chamber of Secrets", "J.K Rowling");
        Book book2 = new Book("Harry Potter & The Order of the Pheonix", "J.K Rowling");

        // Display book information
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());

        // Create a person instance
        Person person1 = new Person("Henrik", "Larsson");
        Person person2 = new Person("Zlatan", "Ibrahimovic");
        // Display person information

        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());

        // Loan a book to the person
        System.out.println("\nPerson1 has loaned book 1\n");
        person1.loanBook(book1);

        // Display person information after borrowing a book
        System.out.println("Person information after borrowing book1:");
        System.out.println(person1.getPersonInformation());

        // Display book information after borrowing a book
        System.out.println("Book information after being borrowed:");
        System.out.println(book1.getBookInformation());

        System.out.println("\nPerson2 has loaned book 2\n");
        person2.loanBook(book2);

        System.out.println("Person2 information after borrowing book2:");
        System.out.println(person2.getPersonInformation());

        System.out.println("Book information after being borrowed by person2:");
        System.out.println(book2.getBookInformation());

        // Return the borrowed book
        System.out.println("\nPerson1 has returned book1\n");
        person1.returnBook(book1);

        // Display person information after returning the book

        System.out.println("Person1 information after returning book1:");
        System.out.println(person1.getPersonInformation());

        // Display book information after borrowing a book

        System.out.println("Book information after being returned:");
        System.out.println(book1.getBookInformation());

        System.out.println("\nBook2 information after being borrowed by person2:");
        System.out.println(book2.getBookInformation());

    }

}
