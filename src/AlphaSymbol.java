import java.util.Scanner;

public class AlphaSymbol
{
    //14. Enter any value and the find out if it is number (0-9) or an alphabet or symbol
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value : ");
        char character = scanner.next().charAt(0);

        if(Character.isDigit(character))
        {
            System.out.format("The value %c is a number", character);
        }else if(Character.isLetter(character))
        {
                System.out.format("The value %c is an alphabet", character);
        }else{
                System.out.format("Thh value %c is a symbol", character );
        }

    }
}
