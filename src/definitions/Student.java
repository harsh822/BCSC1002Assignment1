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
     * This method will allow a Student  to return a issued Book.
     *
     * @param name The name of the Book that the student wants to return.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning \"" + name + "\".");
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
}
