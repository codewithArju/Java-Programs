import java.util.*;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        float age = sc.nextFloat();
        if (age < 18) {
            System.out.println("Congratulation you are eligible for voting");
        } else {
            System.out.println("you are not eligible better luck next time");
        }

    }

}
