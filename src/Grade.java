import java.util.Scanner;
//3. WAP to input student name, roll no, 3 subjects marks...and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Take user input and assign it to the variables
        System.out.print("Student Name - ");
        String name = scan.nextLine();
        System.out.print("Roll number - ");
        int roll = scan.nextInt();
        System.out.print("1st subject marks - ");
        int marks1 = scan.nextInt();
        System.out.print("2nd subject marks - ");
        int marks2 = scan.nextInt();
        System.out.print("3rd subject marks - ");
        int marks3 = scan.nextInt();
        int total = marks1 + marks2 + marks3;
        double percentage = (total / 3);//if total is "int" and "output" is float need a parse(to check)
        String grade = " ";
        String result;
        if (percentage >= 80)
        {
            grade = "A";
            result = "Passed";
        }
        else if (percentage >= 60)
        {
            grade = "B";
            result = "Passed";
        }
        else if (percentage >= 50)
        {
            grade = "C";
            result = "Passed";
        }
        else if (percentage >= 35)
        {
            grade = "D";
            result = "Passed";
        }
        else{

            result = "Failed";
        }
        //Print out results agin using if and else
        if (result == "PASS")
        {
            System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
            System.out.println("Result = " + result);
        }
        else
        {
            System.out.println("Total MArks = " +total);
            System.out.println("Percentage = " +percentage);
            System.out.println("Result = " +result);
        }
    }


}
