import java.util.Scanner;
//8.WAP to input any number and fid our if it is positive , negative or zero
public class PositiveNegative
{
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int no = scan.nextInt();
        if (no > 0)
        {
        System.out.println(no + "is a positive number.");
        }
        else if (no < 0)
        {
        System.out.println(no + "is a negative number.");
        }
        else
        {
        System.out.println(no + " is neither a positive number nor a negative number.");
        }
        }
}
