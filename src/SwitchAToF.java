import java.util.Scanner;

public class SwitchAToF
    //Input any alphabet from a to f and print their city name accordingly (use if else) any other
     //alphabet should be invalid entry
{
    public static void main(String[]args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Alphabet from a to f : ");
        String letter = scan.nextLine();
       // String letter = "";
        //switch expression
        switch (letter) {
            case "a":
                System.out.println("Athens");
                break; 
                
            case "b":
                System.out.print("Birmingham");
                break;

            case "c":
                System.out.println("Cambridge");
                break;

            case "d":
                System.out.print("Denmark");
                break;

            case "e":
                System.out.print("Exeter");
                break;

            case "f":
                System.out.print("Florence");
                break;
            case "A":
                System.out.println("Athens");
                break;

            case "B":
                System.out.print("Birmingham");
                break;

            case "C":
                System.out.println("Cambridge");
                break;

            case "D":
                System.out.print("Denmark");
                break;

            case "E":
                System.out.print("Exeter");
                break;

            case "F":
                System.out.print("Florence");
                break;
            default:
                System.out.println("The keyword " + letter + " you have entered is Invalid");

        }
            
    }
}


