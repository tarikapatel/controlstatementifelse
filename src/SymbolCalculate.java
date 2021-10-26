import java.util.Scanner;
//13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)
public class SymbolCalculate {

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first digit: ");
        int no1 = scan.nextInt();
        System.out.println("Enter your second digit: ");
        int no2 = scan.nextInt();
        System.out.println("Enter your operator you want: (+,-,*,/)");
        char operator = scan.next().charAt(0);

        if(operator=='+')
        {
            System.out.println("Total of "+ no1 +" + "+ no2+ " = " + (no1+no2));
        }
        else if (operator=='-' )
        {
            System.out.println( no1 +" - "+ no2+ " = " + (no1-no2));
        }
        else if (operator == '*' )
        {
            System.out.println( no1 +" * "+ no2+ " = " + (no1*no2));
        }
        else if (operator == '/' )
        {
            System.out.println( no1 +" / "+ no2 +" = " + (no1/no2));
        }
    }
}
