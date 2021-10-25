import java.util.Scanner;

public class LeapYear {
//2. WAP to input any year like 1989 and find out if it is leap year
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = scan.nextInt();
        //leap year condition
        if
        (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
        {
            System.out.println(year + " Specified year is a leap year.");//Year-2020
        }
        else
        {
            System.out.println(year + " Specified year is not a leap year.");// year - 1989
        }
    }
}
