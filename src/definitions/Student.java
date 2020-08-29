/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private static final int MAXIMUM_BOOKS_STUDENT_CAN_ISSUE = 5;
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssuedByStudent;

    public Student() {
        this.studentName = "Harsh";
        this.studentUniversityRollNumber = 191500316;
        this.numberOfBooksIssued = 5;
        this.namesOfBooksIssuedByStudent = new Book[5];
        for (int i = 0; i < namesOfBooksIssuedByStudent.length; i++) {
            namesOfBooksIssuedByStudent[i] = new Book();
        }
    }


    public Student(String studentName, long studentUniversityRollNumber, int numberOfBooksIssued, Book[] namesOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBooksIssuedByStudent() {
        return namesOfBooksIssuedByStudent;
    }

    public void setNamesOfBooksIssuedByStudent(Book[] namesOfBooksIssuedByStudent) {
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
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
     * This method will return the Book which the student has issued.
     *
     * @param bookName The name of the book which is used to be returned.
     * @return It will return Boolean value, if return will be successful then it will return true else false.
     */
    public boolean returnBook(String bookName) {
        boolean returnSuccessful = false;
        int returnBookIndex = 0;
        for (int tempIndex = 0; tempIndex < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; tempIndex++) {
            if (bookName.equals(namesOfBooksIssuedByStudent[tempIndex].getBookName())) {
                returnSuccessful = true;
                returnBookIndex = tempIndex;
                setNumberOfBooksIssued(getNumberOfBooksIssued() - 1);
                break;
            }
        }
        if (returnSuccessful) {
            namesOfBooksIssuedByStudent[returnBookIndex].setBookName(null);
        } else {
            System.out.println("Please Enter the correct book name.");
        }
        return returnSuccessful;
    }

    /**
     * This method will allow show the names of all all issued books .
     */
    public void listOfIssuedBooks() {
        for (Book book : this.namesOfBooksIssuedByStudent) {
            System.out.println(book);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    @Override
    public String toString() {
        return "studentName='" + studentName + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfBooksIssuedByStudent=" + Arrays.toString(namesOfBooksIssuedByStudent) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentUniversityRollNumber == student.studentUniversityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(namesOfBooksIssuedByStudent, student.namesOfBooksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, studentUniversityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(namesOfBooksIssuedByStudent);
        return result;
    }

    /**
     * This method will issue the books to the Student
     *
     * @param bookIssuingIndex The index where the book is issueing.
     * @param bookName         The name of the book which is issuing.
     */
    public void issueBooksToStudents(int bookIssuingIndex, String bookName) {
        namesOfBooksIssuedByStudent[bookIssuingIndex].setBookName(bookName);
    }

    /**
     * This method will show all the books which is issued by the Student.
     */
    public void showIssuedBooksByStudent() {
        if (getNumberOfBooksIssued() == 0) {
            System.out.println("Sorry, you haven't issued any book yet.");
        } else {
            System.out.println("These are the books issued by you: ");
            for (int issuedBookIndex = 0; issuedBookIndex < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; issuedBookIndex++) {
                if (namesOfBooksIssuedByStudent[issuedBookIndex].getBookName() != null) {
                    System.out.print(namesOfBooksIssuedByStudent[issuedBookIndex].getBookName() + (issuedBookIndex < getNumberOfBooksIssued() - 1 ? ", " : ".\n"));
                }
            }
        }
    }
}
