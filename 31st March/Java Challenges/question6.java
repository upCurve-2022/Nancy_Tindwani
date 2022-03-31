import java.util.Scanner;

public class question6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.print("Leap Year");
                else
                    System.out.print("Not a leap year");
            }
            else
                System.out.print("Leap Year");
        }
        else
            System.out.print("Not a leap year");
    }
}
