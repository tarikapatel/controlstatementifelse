import java.util.Scanner;

public class vote {
    //11. Write Java program to allow the user to input his/her age. Then the program will show if the
    //person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
    //old.

    public static void main (String []args)
    {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter your age - ");
        int age = scan.nextInt();

        if(age>=18)
        {
        System.out.println(" Hooray! You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not 18 years old. Sorry, you are not eligible to vote.");
        }

    }
}
