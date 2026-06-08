import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temprature: ");
        Float temp = sc.nextFloat();

        if(temp >= 30)
        {
            System.out.println("HOT Temprature 🌡️🔥"  );
        }    
        else if(temp >= 20)
         {
            System.out.println("NORMAL Temprature 🙂");
         }  
         else
         {
            System.out.println ("COLD Temprature 🥶 ");
         }


    }

}
