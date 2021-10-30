import java.util.Scanner;

public class DivideForLoop
{
//print number divided by 5 between 200-300 using scanner
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting value : ");
        int a = scan.nextInt();
        System.out.println("Enter finish value : ");
        int b = scan.nextInt();
        //for (int i = 200; i <= b; a++)
        for(int i =a ; i<=b; i++)
        {
            if (i % 5 == 0)
            {
            System.out.println(i);
            }
        }
    }
}
