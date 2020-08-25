/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private final Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[5];
        for (int i = 0; i < availableBooks.length; i++) {
            availableBooks[i] = new Book();
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }
}
