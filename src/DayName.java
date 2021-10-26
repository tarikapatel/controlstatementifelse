import java.util.Scanner;
//15. WAP input any number, the print Day name of the week accordingly by using if else
public class DayName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weekday day number 1-7 : ");
        int wkdy = scanner.nextInt();

        if(wkdy == 1)
        {
            System.out.println("Monday");
        }
        else if(wkdy == 2)
        {
        System.out.println("Tuesday");
        }
        else if(wkdy == 3)
        {
        System.out.println("Wednesday");
        }
        else if(wkdy == 4)
        {
        System.out.println("Thursday");
        }
        else if(wkdy == 5)
        {
        System.out.println("Friday");
        }
        else if(wkdy == 6)
        {
        System.out.println("Saturday");
        }
        else if(wkdy == 7)
        {
        System.out.println("Sunday");
        }
        else
        {
        System.out.println("Your given number is invalid.");
        }
    }
}
