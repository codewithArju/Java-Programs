
import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3-digit number:");
        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        // Check whether all digits are distinct
        if (first != middle && middle != last && first != last) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("Digits are not distinct");
        }

        sc.close();
    }
}
