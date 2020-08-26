/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ALL_ISSUED_BOOKS = 3;
    private static final int Exit = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library mylibrary = new Library();
        Student detailsOfInteractingStudent = new Student();
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_BOOK:
                    System.out.println("Available Books in library");
                    String nameOfIssuingBook = scanner.nextLine();
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the Book you want to return: ");
                    scanner.nextLine();
                    nameOfIssuingBook = scanner.nextLine();
                    mylibrary.doReturn(nameOfIssuingBook);
                    break;
                case ALL_ISSUED_BOOKS:
                    break;
                default:
                    break;
            }
        } while (studentInput != Exit);
    }
}
