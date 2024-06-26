package se.lexicon.model;

import java.util.UUID;

// Fields
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;
    private Person borrower;
    // Constructor
    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrower = null;
    }

    // Setters & Getters


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public Person getBorrower() {
        return borrower;
    }
    public void setBorrower(Person borrower) {
     this.borrower = borrower;
     this.isAvailable = (borrower == null);
    }

    public String getBookInformation() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", borrower=" + (borrower != null ? borrower.getFirstName() + " " + borrower.getLastName() : "None") +
                '}';
    }

}