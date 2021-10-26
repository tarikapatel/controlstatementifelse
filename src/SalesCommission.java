import java.util.Scanner;

public class SalesCommission {
    /* 9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales commission
   sales amount >= 50,000 35%
   sales amount >= 30,000 20%
   >= 20,000 10%
   >= 10,000 5%
   < 10,000 2%
*/
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Sales ID - ");
        String id = scan.nextLine();

        System.out.print("Seller's name - ");
        String name = scan.nextLine();

        System.out.print("Sales amount - ");
        int salesAmt = scan.nextInt();

        System.out.print("Basic Salary - ");
        int salary = scan.nextInt();

        float commission;

        if (salesAmt >= 50000)
        {
            commission = salesAmt * 35 / 100;
            System.out.println("The sales commission is " + commission);
        }
        else if (salesAmt <50000 && salesAmt >= 30000)
        {
            commission =  salesAmt * 20 / 100;
            System.out.println("The sales commission for this " + salesAmt + " is " + commission);
        }
        else if (salesAmt<30000 && salesAmt >= 20000)
        {
            commission = (float)salesAmt * 10 / 100;
            System.out.println("The sales commission for this " + salesAmt + " is " + commission);
        }
        else if (salesAmt<20000 && salesAmt >= 10000)
        {
            commission = salesAmt * 5 / 100;
            System.out.println("The sales commission for this " + salesAmt + " is " + commission);
        }
        else if (salesAmt< 10000)
        {
            commission = salesAmt * 2 / 100;
            System.out.println("The commission for this "+ salesAmt + " is " + commission);
        }
    }
}
