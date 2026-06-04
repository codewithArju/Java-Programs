import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  number: ");
        float num = sc.nextFloat();
        if (num % 2 == 0)

            System.out.println("This is the Even No" + " " + num);

        else
            System.out.println("This is the Odd No" + " " + num);

    }
}
