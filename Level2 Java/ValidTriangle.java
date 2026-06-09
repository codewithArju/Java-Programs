import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Value");
        float a = sc.nextFloat();

        System.out.println("Enter Second Value");
        float b = sc.nextFloat();

        System.out.println("Enter Third Value");
        float c = sc.nextFloat();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid Triangle");
        } else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}