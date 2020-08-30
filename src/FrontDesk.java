/*   Created by IntelliJ IDEA.
 *   Author: Jitendra Singh
 *   Date: 30-08-2020
 *   Time: 23:42
 *   File: FrontDesk.java
 */

import java.util.Scanner;

public class FrontDesk {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_ISSUED_BOOK = 2;
    public static final int SHOW_ISSUED_BOOKS = 3;
    public static final int EXIT = 4;
    Student studentDetails;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Library libraryBook = new Library();
        Student studentBook = new Student();
        String bookName;
        String[] myBooks = new String[5];


        System.out.println("-=-=-=-=-=-\"Welcome To Front Desk\"-=-=-=-=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issued book fro me.");
        System.out.println("3. Show me all my issued books.");
        System.out.println("4. Exit.");
    }

}