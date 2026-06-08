import java.util.Scanner;
public class Divisibleby5{
    public static void main(String[]args)
    {
        float num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no");
        num=sc.nextFloat();

        if(num % 5 == 0)
        {
            System.out.println("Number is Divisible");
        }  
        else
            System.out.println("Not divisible");

    }
}