import java.util.Scanner;
//16. Write a Java program that takes the user to provide a single character from the
// alphabet. Print Vowel or Consonant, depending on the user input.
public class VowelConsonant {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a alphabet : ");
        char letter = scan.next().charAt(0);

        //if given character is Lower case Vowel or Upper case Vowel then print vowel otherwise consonant
        if ((letter =='a'|| letter =='e'||letter=='i' ||letter=='0'|| letter=='u')||(letter =='A'|| letter =='E'||letter=='I' ||letter=='O'|| letter=='U'))
        {
        System.out.println(letter + " is a Vowel.");
        }
        else
        {
        System.out.println(letter + " is a Consonant. ");
        }
    }
}
