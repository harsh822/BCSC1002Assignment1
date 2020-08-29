/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int i = 0; i < MAXIMUM_BOOKS_IN_LIBRARY; i++) {
            availableBooks[i] = new Book();
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
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

    /**
     * This method will set the Information of books available in Library.
     */
    public void setBooksInLibrary() {
        availableBooks[0].setBookName("The Guide");
        availableBooks[0].setBookAuthorName("RK Narayan");
        availableBooks[0].setIsbnNumber("9352836537000");
        availableBooks[1].setBookName("Cry, The Peacock");
        availableBooks[1].setBookAuthorName("Nirad C");
        availableBooks[1].setIsbnNumber("9353062012000");
        availableBooks[2].setBookName("Train to Pakistan");
        availableBooks[2].setBookAuthorName("Kiran Desai");
        availableBooks[2].setIsbnNumber("9789332582705");
        availableBooks[3].setBookName("Fundamental of Software Engineering");
        availableBooks[3].setBookAuthorName("Rajib Mall");
        availableBooks[3].setIsbnNumber("9789388028028");
        availableBooks[4].setBookName("Serpent and the Rope");
        availableBooks[4].setBookAuthorName("Raja Rao");
        availableBooks[4].setIsbnNumber("9351199258111");
    }

    /**
     * This method will show the Information of books available in Library.
     */
    public void showAvailableBooks() {
        System.out.println("**********************************************************************************");
        System.out.printf("*%-36s %-21s %-21s*\n", "Book Name", "Author Name", "ISBN Number");
        System.out.println("***********************************************************************************");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("*%-36s %-21s %-21s*\n", availableBooks[libraryIndex].getBookName(), availableBooks[libraryIndex].getBookAuthorName(), availableBooks[libraryIndex].getIsbnNumber());
        }
        System.out.println("************************************************************************************");
    }
}

