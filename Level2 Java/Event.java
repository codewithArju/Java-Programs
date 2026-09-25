import java.util.Scanner;

public class Event
{
    public static void main(String[] args)
    {
        int event;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time event");
        event = sc.nextInt();

        if(event >= 5 && event <= 11)
        {
            System.out.println("Good Morning");
        }
        else if(event >= 12 && event <= 16)
        {
            System.out.println("Good Afternoon");
        }
        else if(event >= 17 && event <= 20)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("Good Night");
        }
    }
}