import java.util.Scanner;

public class Month {

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int digit = sc.nextInt();
         if (digit == 1 || digit == 3 || digit == 5 || digit == 7 ||
        digit == 8 || digit == 10 || digit == 12)
        {
            System.out.println("This is 31 days month");
        }
        else if (digit == 4 || digit == 6||
            digit == 9 ||  digit == 11)
        {
            System.out.println("This is 30 days month");
        }
        else if (digit == 2)
        {
            System.out.println("This month only 28 days");
        }
        else
            System.out.println("Sorry Error !!!!! enter wrong digit");

    }

}
