/*   Created by IntelliJ IDEA.
 *   Author: Jitendra Singh
 *   Date: 30-08-2020
 *   Time: 23:36
 *   File: Library.java
 */

import java.util.Arrays;

public class Library {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private Book[] booksAvailable;

    public Library() {
        this.booksAvailable = new Book[10];

        this.booksAvailable[0] = new Book("The Art Of Letting Go");
        this.booksAvailable[1] = new Book("Harry Potter");
        this.booksAvailable[2] = new Book("Think And Grow Rich");
        this.booksAvailable[3] = new Book("Side Hustle");
        this.booksAvailable[4] = new Book("A Girl In Room Number 309");
        this.booksAvailable[5] = new Book("Eat That Frog");
        this.booksAvailable[6] = new Book("Blink! The Power of Thinking Without Thinking");
        this.booksAvailable[7] = new Book("The POWER of Your Subconscious Mind");
        this.booksAvailable[8] = new Book("How To Talk To Any One");
        this.booksAvailable[9] = new Book("Rich Dad Poor Dad");
    }

    public Book[] getBooksAvailable() {
        return booksAvailable.clone();
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    public void bookIssued(String bookName) {
        System.out.println(ANSI_BLUE + "\"" + bookName + "\" book is issued." + ANSI_RESET);
    }

    public void bookReturned(String bookName) {
        System.out.println(ANSI_GREEN + "Thank you to return \"" + bookName + "\" book." + ANSI_RESET);
    }

    public void booksAvailable() {
        for (Book book : this.booksAvailable) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(booksAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksAvailable(), library.getBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksAvailable());
    }

}