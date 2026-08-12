import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
          float  num = sc.nextFloat();

          if (num >= 95 )
          {
            System.out.println("This is A+ grade");
          }
            else if( num >= 90)
            {
                System.out.println("This is A grade");
            }
            else if( num >= 80)
            {
                System.out.println("This is B+ grade");
            }

            else if( num >= 70)
            {
                System.out.println("This is B grade");
            }

            else if( num >= 65)
            {
                System.out.println("This is C+ grade");
            }

            else if( num >= 60)
            {
                System.out.println("This is C grade");
            }

             else if( num >= 50)
            {
                System.out.println("This is Passing grade");
            }

             else 
            {
                System.out.println("Madarchod Fail Ho gaya");
            }
        }
}
