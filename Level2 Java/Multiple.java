import java.util.Scanner;
public class Multiple  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        float num = sc.nextFloat();

        System.out.print("Enter 2nd number: ");
        float num1 = sc.nextFloat();

        if (num % num1 == 0 || num1 % num == 0)
            System.out.println("One number is a multiple of the other.");
        else
            System.out.println("Neither number is a multiple of the other.");
    }
}