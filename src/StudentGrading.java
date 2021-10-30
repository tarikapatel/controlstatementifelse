import java.util.Scanner;

public class StudentGrading {
    String name = "";
    int rollNumber;
    int englishMarks, mathsMarks, physicsMarks;


    public static void main(String[] args) {
        StudentGrading studentGrading = new StudentGrading();
        Scanner scanner = new Scanner(System.in);

        // Take user input and assign it to the variables
        System.out.print("Please enter your name : ");
        studentGrading.name = scanner.next();
        System.out.print("Please enter your roll number : ");
        studentGrading.rollNumber = scanner.nextInt();
        System.out.print("Please enter English marks : ");
        studentGrading.englishMarks = scanner.nextInt();
        System.out.print("Please enter Maths marks :");
        studentGrading.mathsMarks = scanner.nextInt();
        System.out.print("Please enter Physics marks : ");
        studentGrading.physicsMarks = scanner.nextInt();

        //Pass the values to the method
       studentGrading.findPassFail(studentGrading.name, studentGrading.englishMarks, studentGrading.mathsMarks, studentGrading.physicsMarks);
    }

    public void findPassFail(String name, int english, int maths, int physics) {
        int totalMarks = english + maths + physics;
        float averageMarks = (float) (totalMarks / 3.00);
        String grade = " ";
        String result;

        //Find pass or fail
        if (averageMarks >= 80.0) {
            grade = "A+";
            result = "Passed";
        } else if (averageMarks >= 60.0) {
            grade = "A";
            result = "Passed";
        } else if (averageMarks >= 50.0) {
            grade = "B";
            result = "Passed";
        } else if (averageMarks >= 35.0) {
            grade = "C";
            result = "Passed";
        } else {
            result = "Failed";
        }

        if (result == "Passed") {
            System.out.println(name + " has " + result + " with grade " + grade);
            System.out.println("Total marks of all 3 subjects is " + totalMarks);
            System.out.println("Percentage =  " + averageMarks);
        } else {
            System.out.format("%s has %s", name, result);
        }

    }
}

