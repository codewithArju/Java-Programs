import java.util.*;

public class Number {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		num = sc.nextInt();
		if (num > 0) {
			System.out.println("Possitve No +");
		} else if (num < 0) {
			System.out.println("Negative No -");
		} else {
			System.out.println("Neutral No");
		}

	}

}