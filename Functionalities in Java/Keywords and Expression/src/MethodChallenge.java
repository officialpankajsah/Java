public class MethodChallenge {

// Q -> I. Declare a String containing a Student Name, declare an Integer Variable containing marks of a Student between, 0 to 100.
//      II. Create a method to Calculate the grade of a student based on marks.
//      III. Then finally create another method to display the student name and grade.

// A ->

    public static void main(String[] args) {
        String studentName = "Pankaj Sah";
        int studentMarks = 91;

        char studGrade = gradeCalculator(studentMarks); // Calling the method from gradeCalculator()
        studentDetails(studentName,studGrade); // Calling the method from studentDetails()

    }

    public static char gradeCalculator(int Marks) { //From statement II
        char Grade;

        if (Marks > 90 && Marks <=100) {
            Grade = 'S';
        }
        else if (Marks > 80 && Marks <=90) {
            Grade = 'S';
        }
        else if (Marks > 70 && Marks <=80) {
            Grade = 'S';
        }
        else {
            Grade = 'F';
        }
        return Grade;
    }

    public static void studentDetails(String Name, char studentGrade) { //From statement III
        System.out.println("The student name is " + Name + " and he scored grade " + studentGrade);
    }


}
