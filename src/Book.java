/*   Created by IntelliJ IDEA.
 *   Author: Jitendra Singh
 *   Date: 30-08-2020
 *   Time: 23:23
 *   File: Book.java
 */

import java.util.Objects;

public class Book {
    private String bookName;
    private String nameOfTheAuthor;
    private String isbnNumber;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor) {
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getNameOfTheAuthor(), book.getNameOfTheAuthor()) &&
                Objects.equals(getIsbnNumber(), book.getIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getNameOfTheAuthor(), getIsbnNumber());
    }

}