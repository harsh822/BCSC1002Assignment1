/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

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
}
