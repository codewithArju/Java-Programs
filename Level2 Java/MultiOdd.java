import java.util.*;

public class MultiOdd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
            if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are Even");
        }
        else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are Odd");
        } else
            System.out.println("One is odd another is Even");

    }

}
