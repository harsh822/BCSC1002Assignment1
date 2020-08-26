/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[5];
        for (int i = 0; i < availableBooks.length; i++) {
            availableBooks[i] = new Book();
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    /**
     * This method will allow a student to issue a book.
     *
     * @param name The name of the Book that the student wants to issue.
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for issuing \"" + name + "\".");
    }

    /**
     * This method will allow a Student  to return a issued Book.
     *
     * @param name The name of the Book that the student wants to return.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning \"" + name + "\".");
    }

    @Override
    public String toString() {
        return "availableBooks=" + Arrays.toString(availableBooks) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks);
    }
}
