import java.util.Scanner;

public class Specialchar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");

        char alpha = sc.next().charAt(0);

        if ((alpha >= 'a' && alpha <= 'm') || (alpha >= 'n' && alpha <= 'z')) {
            System.out.println("This is a special character");
        } else {
            System.out.println("Not a special character");
        }
    }
}