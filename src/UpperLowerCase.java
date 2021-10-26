import java.util.Scanner;

public class UpperLowerCase {
    //12. Input any alphabet in uppercase and print it in lowercase

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an alphabet in Uppercase :  ");
        char lower = scan.next().charAt(0);
        System.out.println("Result will be printed in lowercase = " + Character.toLowerCase(lower));
    }

    }

