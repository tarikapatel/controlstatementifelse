import java.util.Scanner;
//5. WAP to input any two numbers and then print their interchanged value
public class InterchangedValue {

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of A and B : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int temp;
        System.out.println("The values before swapping are: " + a + " "+b);
        //Swapping
        temp = a;
        a = b;
        b = temp;
        System.out.println("The values after swapping are: " + a + " "+b);
    }
}
