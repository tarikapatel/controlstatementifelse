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
        float percentage = (float) (total / 300.00 * 100.0);
        String grade = " ";
        if (percentage >= 80)
        {
            System.out.println(grade = "A+" +" " + "PASS");
        }
        else if (percentage >= 60)
        {
            System.out.println(grade = "A" +" " + "PASS");
        }
        else if (percentage >= 50)
        {
            System.out.println(grade = "B" +" " + "PASS");
        }
        else if (percentage >= 35)
        {
            System.out.println(grade = "C" + " " + "FAIL");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
    }


}
