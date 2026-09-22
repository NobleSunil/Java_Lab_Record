package co3;

// Abstract parent class
abstract class StudentEvaluation {

    protected String name;
    protected int rollNo;
    protected int marks;

    // Constructor
    StudentEvaluation(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Concrete method
    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Abstract methods
    abstract int calculateTotalMarks();

    abstract void displayGrade();
}

// UG course evaluation
class UGCourseEvaluation extends StudentEvaluation {

    UGCourseEvaluation(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    @Override
    int calculateTotalMarks() {
        return marks;
    }

    @Override
    void displayGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}

// PG course evaluation
class PGCourseEvaluation extends StudentEvaluation {

    PGCourseEvaluation(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    @Override
    int calculateTotalMarks() {
        return marks;
    }

    @Override
    void displayGrade() {
        if (marks >= 85)
            System.out.println("Grade: A");
        else if (marks >= 70)
            System.out.println("Grade: B");
        else if (marks >= 55)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}

// Certificate course evaluation
class CertificateCourseEvaluation extends StudentEvaluation {

    CertificateCourseEvaluation(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    @Override
    int calculateTotalMarks() {
        return marks;
    }

    @Override
    void displayGrade() {
        if (marks >= 80)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

// Main class
public class UniversityEvaluation {

    public static void main(String[] args) {

        // Array of abstract class references
        StudentEvaluation[] students = {
                new UGCourseEvaluation("Arun", 101, 92),
                new UGCourseEvaluation("Anu", 102, 78),
                new PGCourseEvaluation("Rahul", 103, 88),
                new PGCourseEvaluation("Meera", 104, 72),
                new CertificateCourseEvaluation("John", 105, 81)
        };

        // Display details using loop
        for (StudentEvaluation student : students) {

            System.out.println("--------------------");

            student.displayStudentDetails();

            System.out.println(
                    "Total Marks: " + student.calculateTotalMarks()
            );

            student.displayGrade();
        }
    }
}
