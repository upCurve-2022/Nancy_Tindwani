import java.lang.Math;
import java.util.Scanner;
public class question27 {
    public static void main(String args[] )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
        int num=0,n=number;
        while(number!=0)
        {
            int r=number%10;
            num=num+(int)Math.pow(r,3);
            number=number/10;
        }
        if(n==num)
            System.out.print("Number is armstrong");
        else
            System.out.print("Number is not armstrong");
    }
}
