/*   Created by IntelliJ IDEA.
 *   Author: Jitendra Singh
 *   Date: 30-08-2020
 *   Time: 23:29
 *   File: Student.java
 */

public class Student {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private final String studentName;
    private final long universityRollNumber;
    private final int numberOfBooksIssued;
    private final String[] booksIssuedByStudent = new String[5];
    private Book[] nameOfTheBooksIssued;
    private String nameOfCurrentIssuedBook;

    public Student() {
        this.studentName = "Stephen";
        this.universityRollNumber = 191500675;
        this.numberOfBooksIssued = 1;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public Book[] getNameOfTheBooksIssued() {
        return nameOfTheBooksIssued.clone();
    }

    public void setNameOfTheBooksIssued(Book[] nameOfTheBooksIssued) {
        this.nameOfTheBooksIssued = nameOfTheBooksIssued;
    }

    public String getNameOfCurrentIssuedBook() {
        return nameOfCurrentIssuedBook;
    }

    public void setNameOfCurrentIssuedBook(String nameOfCurrentIssuedBook) {
        this.nameOfCurrentIssuedBook = nameOfCurrentIssuedBook;
    }

}