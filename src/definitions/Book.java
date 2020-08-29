/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumber;

    public Book() {
        this.bookName = null;
        this.bookAuthorName = null;
        this.isbnNumber = null;
    }

    public Book(String bookName, String bookAuthorName, String isbnNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.isbnNumber = isbnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return "Book Name" + getBookName() + "," +
                "Authors Name" + getBookAuthorName() + "," +
                "isbnNumber" + getIsbnNumber() + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthorName, book.bookAuthorName) &&
                Objects.equals(isbnNumber, book.isbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthorName, isbnNumber);
    }
}
