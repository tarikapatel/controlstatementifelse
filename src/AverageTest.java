import java.util.Scanner;

public class AverageTest {
    //7.WAP input any five number and then find average of five numbers

    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int no1 = scan.nextInt();
        System.out.println("Input 2nd number: ");
        int no2 = scan.nextInt();
        System.out.println("Input 3rd number: ");
        int no3 = scan.nextInt();
        System.out.println("Input 4rth number: ");
        int no4 = scan.nextInt();
        System.out.println("Input 5th number: ");
        int no5 = scan.nextInt();

        //Average = Sum of the numbers / number of numbers
        System.out.println("Average of five no.'s is: " +(no1 + no2 + no3 + no4 + no5) / 5);
    }
}
