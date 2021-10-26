import java.util.Scanner;

public class CityFromAtoZ {
    //10. Input any alphabet from a to f and print their city name accordingly (use if else) any other
    //alphabet should be invalid entry
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Alphabet from a to f : ");
        char letter = scan.nextLine().charAt(0);
        if (letter == 'a' || letter == 'A')
        {
            System.out.print("Athens");
        }
        else if (letter == 'b' || letter == 'B')
        {
            System.out.print("Birmingham");
        }
        else if (letter == 'c' || letter == 'C')
        {
            System.out.println("Cambridge");
        }
        else if (letter == 'd' || letter == 'D')
        {
            System.out.print("Denmark");
        }
        else if (letter == 'e' || letter == 'E')
        {
            System.out.print("Exeter");
        }
        else if (letter == 'f' || letter == 'F')
        {
            System.out.print("Florence");
        }
        else
        {
            System.out.println("The keyword " + letter + " you have entered is Invalid");
        }
    }
}
