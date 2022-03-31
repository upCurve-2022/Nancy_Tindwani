import java.lang.Math;
import java.util.Scanner;
public class question13 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till which you want to display the series : ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print((int)Math.pow(i,i));
            if(i<n)
                System.out.print(",");
        }
    }
}
