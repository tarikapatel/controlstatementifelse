import java.util.Scanner;
//1. Input any two number and find out its odd or even use turnery operator (? :)
public class TurneryOperator {

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scan.nextInt();

        //ternary operator to check number

        String result = (x%2==0) ? "Even" : "Odd";
        System.out.println(x + " is an " + result + " number");
    }
}
