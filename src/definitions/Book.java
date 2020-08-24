/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumber;

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

    public Book() {
        this.bookName = "The Discovery of India";
        this.bookAuthorName = "Jawahar Lal Nehru";
        this.isbnNumber = "12536142";
    }

    public Book(String bookName, String bookAuthorName, String isbnNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return "Book Name" + getBookName() + "," +
                "Authors Name" + getBookAuthorName() + "," +
                "isbnNumber" + getIsbnNumber() + ".";

    }
}
