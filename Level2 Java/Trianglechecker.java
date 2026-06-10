import java.util.Scanner;

public class Trianglechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        float a = sc.nextFloat();

        System.out.println("Enter Second Value");
        float b = sc.nextFloat();

        System.out.println("Enter the Third Value");
        float c = sc.nextFloat();

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a != b && b != c && c != a)
            System.out.println("Scalene Triangle");
        else if (a == b || b == a || a == c)
            System.out.println("Isocales Triangle");
        else
            System.out.println("Another type triangle");
    }
}
